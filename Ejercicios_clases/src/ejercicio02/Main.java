package ejercicio02;

public class Main {

	/*Implementar una jerarquía EMPLEADO de cualquier tipo de empresa que te sea
	familiar. La jerarquía debe tener al menos cuatro niveles, con herencia de miembros
	datos y métodos.*/
	
	public static void main(String[] args) {
		Director ceo  = new Director();
		ceo.introducir();
		ceo.visualizar();
	}
}