package programa.entidades.estruturas;

import java.util.Stack;
import programa.entidades.Estado;
public class Pilha implements EstadoAbertos {
	
	private Stack<Estado> elementos = new Stack<>();

	@Override
	public void push(Estado estado) {
		this.elementos.push(estado);
	}

	@Override
	public Estado pop() {
		return this.elementos.pop();
	}

	@Override
	public int size() {
		return this.elementos.size();
	}
	
	

}

