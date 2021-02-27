package programa.entidades;

import java.util.ArrayList;
import java.util.List;

import programa.entidades.estruturas.EstadoAbertos;
import programa.entidades.estruturas.Fila;
import programa.entidades.grafo.Caminho;
import programa.entidades.grafo.Vertice;
import programa.entidades.grafo.grafo;

public class EspacoEstados {
	
	grafo Grafo;
	
	List<Estado> estadosIniciais;
	
	EstadoAbertos estadosAbertos = new Fila();
	
	public EspacoEstados(grafo g) {
		this.Grafo = g;
		
		estadosIniciais = new ArrayList<>();
		for(Vertice v: g.getTodosVertices()) {
			Caminho c = new Caminho(v);
			Estado estadoInicial = new Estado(g, c);
			estadosIniciais.add(estadoInicial);
		}
		
		for(Estado e: estadosIniciais) {
			estadosAbertos.push(e);
		}
	}
	
	public Estado solve() {
		while(estadosAbertos.size()>0) {
			Estado estado = estadosAbertos.pop();
			System.out.println("tentando resolver");
			System.out.println(estado);
			System.out.println();
			if(estado.eObjetivo()) {
				System.out.println("Solucao encontrada");
				return estado;
			}
			for(Estado e: estado.geraFilhos()) {
				estadosAbertos.push(e);
			}
		}
		System.out.println("Nao encontramos solucao!!");
		return null;
	}
	
	

}

