package programa.entidades.grafo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class grafo {
    Map<String, Vertice> V;
	Map<String, Aresta> A;
	Map<Vertice, List<Aresta>> listaDeAdjacencia;
	public grafo(){//cria um mapa de arvore para cada vertice , aresta e lista de adjacencia
        V=new TreeMap<>();
        A=new TreeMap<>();
        listaDeAdjacencia=new TreeMap<>();
    }
    public void addVertice(Vertice v){
        V.put(v.ponto,v);
        listaDeAdjacencia.put(v,new ArrayList<>());
    }
    public void addVertice(String nomeVertice) {
		this.addVertice(new Vertice(nomeVertice));
	}
	
	public void addAresta(Aresta a) {
		A.put(a.ponte, a);
		listaDeAdjacencia.get(a.v1).add(a);
		listaDeAdjacencia.get(a.v2).add(a);
	}
	
	public void addAresta(String nomeAresta, String nomeV1, String nomeV2) {
		Aresta a = new Aresta(nomeAresta, new Vertice(nomeV1), new Vertice(nomeV2));
		this.addAresta(a);
	}
	
	public Vertice getVertice(String nome) {
		return this.V.get(nome);
	}
	
	public Aresta getAresta(String nome) {
		return this.A.get(nome);
	}
	
	public Collection<Vertice> getTodosVertices(){
		return this.V.values();
	}
	
	public Collection<Aresta> getTodosArestas(){
		return this.A.values();
	} 
	
	public Map<Vertice, List<Aresta>> getListaAdjacencia(){
		return this.listaDeAdjacencia;
	}
	
	public static List<Aresta> getArestasAdjacentes(Vertice v){
		return this.listaDeAdjacencia.get(v);
	}
	
	@Override
	public String toString() {
		String res = "";
		
		for(Vertice v: this.V.values()) {
			res += v + "\n";
		}
		for(Aresta a: this.A.values()) {
			res += a + "\n";
		}
		
		return res;
	}
}
