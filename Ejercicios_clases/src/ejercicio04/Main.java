package ejercicio04;

public class Main {

	/*Construir una jerarquía de clases que almacene información sobre aeronaves. Comenzar
	con una clase base general, llamada aeroplanos, que almacene el número de pasajeros
	que pueden ser transportados y la cantidad de carga que puede llevar. A continuación
	crear dos clases derivadas, avión y globos, a partir de aeronaves. Avión debe almacenar
	el tipo del motor empleado (propulsión o jet) y su rango, en millas. Globo debe
	almacenar información sobre el tipo de combustible utilizado para la ascensión del
	globo (hidrógeno o helio) y su altitud máxima (en pies). Construir un pequeño programa
	que muestre esta jerarquía de clases.*/
	
	public static void main(String[] args) {
		Avion avion = new Avion();
		avion.introducir();
		System.out.println(avion.toString());
	}
}
