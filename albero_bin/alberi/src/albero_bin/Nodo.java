package albero_bin;

public class Nodo {
	
	private char value;
	private Nodo left; // figlio sinistro
	private Nodo right; // figlio destro

	public Nodo(char valore) {
		value = valore;
		left = null;
		right = null;
		}

	public char getValue() { return value; }
	public void setLeftChild(Nodo child) { left = child; }
	public void setRightChild(Nodo child) { right = child; }
	public Nodo getLeftChild() { return left; }
	public Nodo getRightChild() { return right; }
}
