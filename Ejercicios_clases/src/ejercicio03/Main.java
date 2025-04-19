package ejercicio03;

public class Main {
	
	/*Construir una clase base genérica llamada edificio que almacene el número de plantas
	que tiene el edificio, el número de habitaciones y su superficie total. Crear una clase
	derivada llamada casa que herede edificio y que almacene también lo siguiente: el
	número de dormitorios y de baños. Crear también otra clase derivada llamada oficina
	que herede edificio y que almacene además el número de extintores y de teléfonos.
	Definir los atributos como privados, y los métodos como públicos.*/

	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.introducir();
		System.out.println(casa.toString());
	}
}