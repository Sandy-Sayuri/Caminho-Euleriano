package programa.teste;

import programa.dao.InputInstance;
import programa.entidades.Estado;
import programa.entidades.grafo.Caminho;
import programa.entidades.grafo.ParArestaVertice;
import programa.entidades.grafo.grafo;

public class TesteEstado {
	
	public static void main(String[] args) {
		grafo g = InputInstance.getInstance("files/inst01.in");
		System.out.println(g);
		Caminho c = new Caminho(g.getVertice("b"));
		c.addPar(
				new ParArestaVertice(
						g.getAresta("a2"), 
						g.getVertice("c")));
		c.addPar(
				new ParArestaVertice(
						g.getAresta("a3"), 
						g.getVertice("d")));
		c.addPar(
				new ParArestaVertice(
						g.getAresta("a4"), 
						g.getVertice("a")));
		Estado e = new Estado(g, c);
		System.out.println(e);
		System.out.println(e.eValido());
		System.out.println(e.eObjetivo());
		c.addPar(
				new ParArestaVertice(
						g.getAresta("a1"), 
						g.getVertice("b")));
		c.addPar(
				new ParArestaVertice(
						g.getAresta("a5"), 
						g.getVertice("d")));
		e = new Estado(g, c);
		System.out.println(e);
		System.out.println(e.eValido());
		System.out.println(e.eObjetivo());
		c.addPar(
				new ParArestaVertice(
						g.getAresta("a1"), 
						g.getVertice("b")));
		e = new Estado(g, c);
		System.out.println(e);
		System.out.println(e.eValido());
		System.out.println(e.eObjetivo());
	}

}

