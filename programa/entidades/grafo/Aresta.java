package programa.entidades.grafo;
//definisão de aresta
public class Aresta implements Comparable<Aresta>{
	String ponte;
	Vertice v1;
	Vertice v2;
	
	public Aresta(String Ponte, Vertice V1, Vertice V2) {//emcapsulamento
		this.ponte = Ponte;
		this.v1 = V1;
		this.v2 = V2;
	}
	
	public Vertice getVerticeAdjacenteQueNao(Vertice v) {//para ver a abertura dos braços
		if(v.equals(v1)) {
			return v2;
		}
		else {
			return v1;
		}
	}

	@Override
	public boolean equals(Object obj) {//rodando os vertices anteriores
		if (this.ponte == obj)
			return true;
		if (obj == null)//o obj tem que existir
			return false;
		if (getClass() != obj.getClass())//??
			return false;
		Aresta outra = (Aresta) obj;//add o obj como outra aresta
		if (ponte == null) {//a ponte tem que existir
			if (outra.ponte != null)//e a outra ponte tembem te que existir
				return false;
		} else if (!ponte.equals(outra.ponte))//e as 2 pontes n podem ser iguais
			return false;
		return true;
	}

	@Override
	public int compareTo(Aresta o) {//compara as ponte pegas para que n tenha 2 iguais
		return this.ponte.compareTo(o.ponte);
	}
	
	@Override
	public String toString() {//para dar o print
		String res = "";
		res += this.ponte + ": " + this.v1 + "---" + this.v2;
		return res;
	}
	
	

}