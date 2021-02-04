package trees;

public class No<T> {
	// Declaração do tipo generalizado
	private T tipo;
	// Nó esquerdo e nó direito
	private No<T> esq;
	private No<T> dir;
	
	// Construtor
	public No(T tipo) {
		super();
		this.tipo = tipo;
		this.esq = null;
		this.dir = null;
	}

	// Getters e Setters
	public T getTipo() {
		return tipo;
	}

	public void setTipo(T tipo) {
		this.tipo = tipo;
	}

	public No<T> getEsq() {
		return esq;
	}

	public void setEsq(No<T> esq) {
		this.esq = esq;
	}

	public No<T> getDir() {
		return dir;
	}

	public void setDir(No<T> dir) {
		this.dir = dir;
	}	
}
