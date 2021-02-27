package programa.teste;

import programa.dao.InputInstance;
import programa.entidades.Estado;
import programa.entidades.grafo.Caminho;
import programa.entidades.grafo.grafo;

public class TestaGeraFilho {
	
	public static void main(String[] args) {
		grafo g = InputInstance.getInstance("file/inst01.in");
		System.out.println(g);
		Caminho c = new Caminho(g.getVertice("b"));
		Estado e = new Estado(g, c);
		System.out.println(e);
		var f = e.geraFilhos();
		for(Estado et: f) {
			et.geraFilhos();
			System.out.println();
		}
	}

}
