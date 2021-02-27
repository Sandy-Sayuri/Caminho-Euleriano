package programa.entidades.estruturas;
import programa.entidades.Estado;
public interface EstadoAbertos {
	
	public void push(Estado estado);
	public Estado pop();
	public int size();

}