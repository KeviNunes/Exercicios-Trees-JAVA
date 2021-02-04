package trees;

public class Tree<T extends Comparable<T>> {
	// Declaração da tree (Maiores números ficam à direita dos nós)
	private No<T> root;

	// Construtor
	public Tree() {
		super();
		this.root = null;
	}
	
	// Método getter
	public No<T> getRoot(){
		return root;
	}
	
	// Método de adicionar nó na tree
	public void add(T tipo) {
		// Declaração do novo nó
		No<T> novo = new No<T>(tipo);
		
		//Verifica é a inserção da raiz
		if(root == null) this.root= novo;
		
		// Definindo o valor do nó anterior, caso haja
		else {
			No<T> ant = this.root;
			
			while(true) {
				// Caso o novo nó for menor que o anterior
				if(novo.getTipo().compareTo(ant.getTipo()) == -1) {
					
					// Verificação de que se há algum valor no próximo nó esquerdo
					if(ant.getEsq()!=null) ant = ant.getEsq();
					else {
						// Definição do próximo nó esquerdo
						ant.setEsq(novo);
						break;
					}
					
				}else {
					// Verificação de que se há algum valor no próximo nó direito
					if(ant.getDir()!=null) ant = ant.getDir();
					
					else {
						// Definição do próximo nó esquerdo
						ant.setDir(novo);
						break;
					}
				}
			}
		}
	}
	
	// Mostra a tree em ordem
	public void emOrdem(No<T> n) {
		if(n != null) {
			emOrdem(n.getEsq());
			System.out.print(n.getTipo()+" ");
			emOrdem(n.getDir());
		}
	}
	
	// Mostra a tree em ordem
	public void preOrdem(No<T> n) {
		if(n != null) {
			System.out.print(n.getTipo()+" ");
			preOrdem(n.getEsq());
			preOrdem(n.getDir());
		}
	}
	
	// Mostra a tree em ordem
		public void posOrdem(No<T> n) {
			if(n != null) {
				preOrdem(n.getEsq());
				preOrdem(n.getDir());
				System.out.print(n.getTipo()+" ");
			}
		}
	
}
