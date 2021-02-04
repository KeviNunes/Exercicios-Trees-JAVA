package trees;

public class TesteTree {

	public static void main(String[] args) {
		// Declaração da tree
		Tree<Integer> tree = new Tree<Integer>();

		// Inserção dos valores
		tree.add(10);
		tree.add(8); 
		tree.add(5);
		tree.add(9);
		tree.add(7);
		tree.add(18);
		tree.add(13);
		tree.add(20);
		
		// Mostrar tree em ordem
		System.out.println("Exibição em ordem:");
		tree.emOrdem(tree.getRoot());
		
		// Mostrar tree em ordem
		System.out.println("\n\nExibição em pré-ordem:");
		tree.preOrdem(tree.getRoot());
		
		// Mostrar tree em ordem
		System.out.println("\n\nExibição em pós-ordem:");
		tree.posOrdem(tree.getRoot());
	}
}