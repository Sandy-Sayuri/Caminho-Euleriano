package programa.teste;

import programa.dao.InputInstance;
import programa.entidades.EspacoEstados;
import programa.entidades.Estado;
import programa.entidades.grafo.grafo;

public class TesteBusca {
    public static void main(String[] args) {
		grafo g = InputInstance.getInstance("files/inst-pontes-konis.in");
		EspacoEstados ee = new EspacoEstados(g);
		Estado solucao = ee.solve();
		
		if(solucao==null) {
			System.out.println("solucao null");
		}else {
			System.out.println("Solucao ");
			System.out.println(solucao);
		}
	}
}
