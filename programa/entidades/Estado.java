package programa.entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import programa.entidades.grafo.Aresta;
import programa.entidades.grafo.Caminho;
import programa.entidades.grafo.ParArestaVertice;
import programa.entidades.grafo.Vertice;
import programa.entidades.grafo.grafo;

public class Estado {
    Caminho caminho;
    grafo Grafo;
    public Estado(grafo g,Caminho aCaminho){
        this.Grafo=g;
        this.caminho=aCaminho;
    }
    public boolean eValido(){
        boolean res=true;
        Set<Aresta> arestas = new TreeSet<>();
        for(ParArestaVertice par:this.caminho.paresArestaVertice){
            Aresta a = par.a;
            if(arestas.contains(a)){
                return false;
            }
            arestas.add(a);
        }
        return res;
    }
    public boolean eObjetivo(){
        Collection<Aresta> todasArestas = Grafo.getTodosArestas();
        for(Aresta a: todasArestas) {
			if(! caminho.containsAresta(a)) {
				return false;
			}
		}
		return true;
	}
    public Collection<Estado> geraFilhos(){
		Collection<Estado> filhos = new ArrayList<>();
		
		Caminho caminho = this.caminho;
		Vertice ultimoVertice = caminho.ultimoVertice();
		List<Aresta> arestasAdjacentes = Grafo.getArestasAdjacentes(ultimoVertice);
		for(Aresta a: arestasAdjacentes) {
			if(caminho.containsAresta(a)) continue;
			Estado filho = new Estado(Grafo, this.caminho.deepCopy());
			Vertice v = a.getVerticeAdjacenteQueNao(this.caminho.ultimoVertice());
			filho.caminho.addPar(new ParArestaVertice(a, v));
			filhos.add(filho);
		}
		
		
		return filhos;
	}
	
	public Estado deepCopy() {
		Estado novoEstado = new Estado(this.Grafo, this.caminho.deepCopy());
		return novoEstado;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += this.caminho;
		return res;
	}
}
