package ejercicios1;

import java.util.Scanner;

public class Ejercicio05 {
	static Scanner t = new Scanner(System.in);
	
	/*Se quiere leer del dispositivo de entrada los n códigos de asignatura de la carrera de
	sociología. Escribe un segmento de código para realizar este proceso.*/
	
	public static void main(String[] args) {
		int tam = dimensionar();
		String codigos[] = new String[tam];
		introducir(codigos);
		visualizar(codigos);
	}
	
	public static int dimensionar() {
		System.out.print("Introducir la cantidad de códigos: ");
		return t.nextInt();
	}
	
	private static void introducir(String[] codigos) {
		t.nextLine();
		for (int i=0; i<codigos.length; i++) {
			System.out.print("Código [" + i + "]: ");
			codigos[i] = t.nextLine();
		}
		System.out.println();
	}

	private static void visualizar(String[] codigos) {
		for (int i=0; i<codigos.length; i++) {
			System.out.println("Código [" + i + "]: " + codigos[i]);
		}
	}
}
