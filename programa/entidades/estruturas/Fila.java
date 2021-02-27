package programa.entidades.estruturas;
import java.util.Queue;
import java.util.LinkedList;
import programa.entidades.Estado;
public class Fila implements EstadoAbertos {
	
	Queue<Estado> elementos = new LinkedList<>();

	@Override
	public void push(Estado estado) {
		elementos.add(estado);
	}

	@Override
	public Estado pop() {
		return elementos.poll();
	}

	@Override
	public int size() {
		return elementos.size();
	}

}
