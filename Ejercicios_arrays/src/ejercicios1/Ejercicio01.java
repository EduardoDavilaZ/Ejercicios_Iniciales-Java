package ejercicios1;

import java.util.Scanner;

public class Ejercicio01 {
	static Scanner scn = new Scanner(System.in);
	
	/*Escribir un método que invierta el contenido de n números enteros. El primero
	se vuelve el último, el segundo, el penúltimo etc.*/
	
	public static void main(String[] args) {
		int tam = introducirTam();
		int t[] = new int[tam];
		introducir(t);
		invertir(t);
		visualizar(t);
	}

	private static int introducirTam() {
		System.out.print("Tamaño: ");
		int tam = scn.nextInt();
		return tam;
	}
	
	private static void introducir(int[] t) {
		for (int i=0; i<t.length; i++) {
			System.out.print("T[" + i + "]: ");
			t[i] = scn.nextInt();
		}
	}
	
	private static void invertir(int[] t) {
		for (int i=0; i<t.length / 2; i++) {
			int aux = t[i];
			t[i] = t[t.length - i - 1];
			t[t.length - i - 1] = aux;
		}
	}
	
	private static void visualizar(int[] t) {
		for (int i=0; i<t.length; i++) {
			System.out.print("\t" + t[i]);
		}
	}
}
