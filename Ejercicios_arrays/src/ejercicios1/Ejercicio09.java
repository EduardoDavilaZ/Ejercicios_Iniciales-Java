package ejercicios1;

import java.util.Scanner;

public class Ejercicio09 {
	static Scanner scn = new Scanner(System.in);
	
	/*Escribir un programa en el que se genere aletoriamente un vector de 20 números
	enteros. Ordenar el vector. Mostrar el vector original y el vector con la
	distribución indicada.*/
	
	public static void main(String[] args) {
		int t[][] = new int[4][5];
		
		introducir(t);
		visualizar(t);
		ordenar(t);
		visualizar(t);
	}

	private static void introducir(int[][] t) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t.length; j++) {
				System.out.print("T["+i+"]["+j+"]: ");
				t[i][j] = scn.nextInt();
			}
		}
	}

	private static void ordenar(int[][] t) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t.length; j++) {
				for (int k=0; k<t.length-j-1; k++) {
					if (t[i][k] > t[i][k+1]) {
						int aux = t[i][k];
						t[i][k] = t[i][k+1];
						t[i][k+1] = aux;
					}
				}
			}
		}
	}

	private static void visualizar(int[][] t) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t.length; j++) {
				System.out.print("\t" + t[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
