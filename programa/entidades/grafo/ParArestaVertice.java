package programa.entidades.grafo;

public class ParArestaVertice {
    public Aresta a;
    public Vertice v;
        public ParArestaVertice(Aresta A,Vertice V){//encapsulamento 
            this.a=A;
            this.v=V;
        }
        @Override
        public String toString(){//print na tela
            String res=" " + a.ponte + " " + v.ponto;
            return res;
        }
    
}
