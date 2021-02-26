package programa.entidades;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import programa.entidades.grafo.Aresta;
import programa.entidades.grafo.Caminho;
import programa.entidades.grafo.ParArestaVertice;
import programa.entidades.grafo.grafo;

public class Estado {
    Caminho caminho;
    grafo Grafo;
    public Estado(grafo g,Caminho aCaminho){
        this.Grafo=g;
        this.caminho=aCaminho;
    }
    public boolean éValido(){
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
    public boolean éObjetivo(){
        Collection<Aresta> todasArestas = grafo.getTodosArestas();
        
    }
}
