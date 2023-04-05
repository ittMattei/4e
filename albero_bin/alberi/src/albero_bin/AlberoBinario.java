package albero_bin;

public class AlberoBinario {
	private Nodo root;

	public AlberoBinario() {
		root = null;
	}
	
	public void setRoot(Nodo root) {
		this.root = root;
	}
	
	public void visitaInPreOrdine() {
		visitaInPreOrdine(root);
	}
	private void visitaInPreOrdine(Nodo p) {
		if(p==null) 
			return;
		
		System.out.print(p.getValue()+" ");
		
		if(p.getLeftChild()!=null) 
			visitaInPreOrdine(p.getLeftChild());
		if(p.getRightChild()!=null)
			visitaInPreOrdine(p.getRightChild());
		
	}
	public void visitaInOrdine() {
		visitaInOrdine(root);
	}
	private void visitaInOrdine(Nodo p) {
		if(p==null) 
			return;
		
		if(p.getLeftChild()!=null) 
			visitaInOrdine(p.getLeftChild());
		
		System.out.print(p.getValue()+" ");
		
		if(p.getRightChild()!=null)
			visitaInOrdine(p.getRightChild());
		
	}
	public void visitaInPostOrdine() {
		visitaInPostOrdine(root);
	}
	private void visitaInPostOrdine(Nodo p) {
		if(p==null) 
			return;
		
		
		
		if(p.getLeftChild()!=null) 
			visitaInPostOrdine(p.getLeftChild());
		if(p.getRightChild()!=null)
			visitaInPostOrdine(p.getRightChild());
		
		System.out.print(p.getValue()+" ");
	}
}