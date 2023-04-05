package albero_bin;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlberoBinario alfa = new AlberoBinario();
		
		Nodo a = new Nodo('a');
		alfa.setRoot(a);
		
		Nodo b = new Nodo('b');
		a.setLeftChild(b);
		Nodo e = new Nodo('e');
		a.setRightChild(e);
		
		Nodo c = new Nodo('c');
		b.setLeftChild(c);
		Nodo d = new Nodo('d');
		b.setRightChild(d);
		
		
		
		Nodo f = new Nodo('f');
		e.setLeftChild(f);
		Nodo g = new Nodo('g');
		e.setRightChild(g);
		
	System.out.println("Visita in Pre-Ordine");	
	alfa.visitaInPreOrdine();
	System.out.println("");
	System.out.println("Visita in Ordine");	
	alfa.visitaInOrdine();
	System.out.println("");
	System.out.println("Visita in Post-Ordine");	
	alfa.visitaInPostOrdine();
	}

}
