package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
	static Scanner scn = new Scanner(System.in);
	
	/*Escribir un método que invierta el contenido de n números enteros. El primero
	se vuelve el último, el segundo, el penúltimo etc.*/
	
	public static void main(String[] args) {
		System.out.print("Introduce el tamaño: ");
		int tam = scn.nextInt();
		int t[] = new int[tam];
		
		introducir(t);
		invertir(t);
		visualizar(t);
	}
	
	public static void introducir(int t[]) {
		for (int i=0; i<t.length; i++) {
			System.out.print("T["+ i + "]: ");
			t[i] = scn.nextInt();
		}
	}
	
	public static void invertir(int t[]) {
		for (int i=0; i<(t.length / 2); i++) {
			int aux = t[i];
			t[i] = t[t.length - i - 1];
			t[t.length - i - 1] = aux;
		}
	}
	
	public static void visualizar(int t[]) {
		for (int i=0; i<t.length; i++) {
			System.out.println("T["+ i + "]: " + t[i]);
		}
	}
}
