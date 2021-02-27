package programa.teste;
import programa.dao.InputInstance;
import programa.entidades.grafo.grafo;
public class TesteDao {
	
	public static void main(String[] args) {
		grafo g = InputInstance.getInstance("files/inst-pontes-konis.in");
		System.out.println(g);
	}

}