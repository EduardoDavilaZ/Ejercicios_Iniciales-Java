package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un programa que lea las dimensiones de una matriz, lea y visualice la
	matriz y a continuación encuentre el mayor y menor elemento de la matriz y sus
	posiciones.*/
	
	public static void main(String[] args) {
		int m[][] = new int[3][3];
		
		introducir(m);
		System.out.println("Mayor: " + buscarMayor(m));
		System.out.println("Menor: " + buscarMenor(m));
	}
	
	private static void introducir(int m[][]) {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("T[" + i + "]: ");
				m[i][j] = t.nextInt();
			}
		}
	}
	
	private static int buscarMayor(int m[][]) {
		int mayor = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (m[i][j] > mayor || (i == 0 && j == 0)) {
					mayor = m[i][j];
				}
			}
		}
		return mayor;
	}
	
	private static int buscarMenor(int m[][]) {
		int menor = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (m[i][j] < menor || (i == 0 && j == 0)) {
					menor = m[i][j];
				}
			}
		}
		return menor;
	}
}
