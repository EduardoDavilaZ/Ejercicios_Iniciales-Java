package ejercicio06;

public class ListaEnlazada {
	
	private Nodo cabeza;

	public ListaEnlazada() {
		cabeza = null;
	}
	
	/**
	 * Si la cabeza es nula, se agrega una cabeza; sino, se
	 * crea un nodo auxiliar (actual) para avanzar hasta el
	 * último nodo de la lista, para referenciarlo al nuevo.
	 * @param actual = variable auxilizar.
	 */
	
	public void introducir(int dato) {
		Nodo nuevo = new Nodo(dato);
		if (cabeza == null) { 
			cabeza = nuevo;
		} else {
			Nodo actual = cabeza;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}
	
	public void visualizar() {
		System.out.println("\nLista enlazada: ");
		Nodo actual = cabeza; // Partir desde la cabeza
		while(actual != null) {
			System.out.println("	- " + actual.dato);
			actual = actual.siguiente;
		}
	}
}
