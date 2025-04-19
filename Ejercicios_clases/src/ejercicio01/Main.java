package ejercicio01;

public class Main {
	
	/*Definir una clase PERSONA que contenga información de propósito general común a
	todas las personas (nombre, dirección, fecha de nacimiento, sexo etc.). Diseñar una
	jerarquía de clases que contemple las siguientes clases: estudiante (no expediente, nota,
	etc.) y empleado (NSS, sueldo etc.).
	Escribir un programa que lea datos y los visualice, utilizando varias formas de cargas
	datos en la clase:
		a. estudiantes
		b. empleados*/
	
	public static void main(String[] args) {
		Fecha fecha = new Fecha();
		Estudiante estudiante = new Estudiante("", "", fecha, ' ', 0, 0);
		estudiante.introducir();
		estudiante.visualizar();
	}
}
