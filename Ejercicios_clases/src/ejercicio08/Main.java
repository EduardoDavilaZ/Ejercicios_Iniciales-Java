package ejercicio08;

public class Main {

	/*Crear una clase llamada hora que tenga miembros datos horas, minutos y segundos de
	tipo int. Un constructor inicializará este dato a 0, y otro lo inicializará a valores fijos.
	Un método miembro visualizará la hora en formato 11:59:59, Otro método miembro
	sumará dos objetos de tipo hora pasados como argumentos.
	Una clase con el método principal main() crea dos objetos inicializados y uno que no
	está inicializado. Sumar los dos valores inicializados y dejar el resultado en el objeto no
	inicializado. Por último, visualizar el valor resultante.*/
	
	public static void main(String[] args) {
		Hora hora1 = new Hora();
		Hora hora2 = new Hora(3, 10, 40);
		
		hora1.introducir();
		System.out.println(hora1.toString());
		hora1.sumar(hora2);
		System.out.println(hora1.toString());
	}
}