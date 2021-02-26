package programa.entidades.grafo;
//defunisão de Vertice
public class Vertice implements Comparable<Vertice>{
	String ponto;
	public Vertice(String pontos) {//emcapsulamento
		this.ponto = pontos;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.ponto == obj)//é um dos pontos da lista ??
			return true;
		if (obj == null)//o objeto tem que existir
			return false;
		if (getClass() != obj.getClass())//oq é essas classes ??para que serve??
			return false;
		Vertice outro = (Vertice) obj;
		if (ponto == null) {//Se o ponto for nulo e 
			if (outro.ponto != null)//o ponto seguite tambem eles n exixtem 
				return false;
		} else if (!ponto.equals(outro.ponto))// para evitar pontos iguais 
			return false;
		return true;
	}

	@Override
	public int compareTo(Vertice o) {//compara os pontos de lista com o ponto pego
		return this.ponto.compareTo(o.ponto);
	}
	
	
	@Override
	public String toString() {//tramforma o ponto em um Letra
		return this.ponto;
	}
	
	
	

}

