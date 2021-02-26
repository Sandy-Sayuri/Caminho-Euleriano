package programa.entidades.grafo;

import java.util.ArrayList;
import java.util.List;

public class Caminho {
    public Vertice inicial;
    public List<ParArestaVertice> paresArestaVertice;
    Vertice ultimoVertice;
    public Caminho(Vertice aInicial){
        this.inicial=aInicial;
        this.ultimoVertice=aInicial;
        paresArestaVertice=new ArrayList<>();
    }
    public void addPar(ParArestaVertice pav){
        paresArestaVertice.add(pav);//add um par de vertices
        ultimoVertice=pav.v;
    }
    public Vertice ultimoVertice(){
        return this.ultimoVertice;//ultimo vertice 
    }
    public boolean containsAresta(Aresta a){
        for(ParArestaVertice pav :paresArestaVertice){
            if(a.equals(pav.a))return true;
        }
        return false;
    }
    public Caminho deepCopy(){
        Caminho novoCaminho = new Caminho(this.inicial);
        for(ParArestaVertice par:this.paresArestaVertice){
            novoCaminho.addPar(par);
        }
        return novoCaminho;
    }
    @Override
	public String toString() {//print
		String res = "";
		res += this.inicial + " ";
		for(ParArestaVertice par: this.paresArestaVertice) {
			res += par + " ";
		}
		return res;
	}
}

