package ejercicios1;

import java.util.Scanner;

public class Ejercicio05 {
	static Scanner scn = new Scanner(System.in);
	
	/*Escribir un programa para leer una matriz 4 x 4 y formar la matriz transpuesta.*/
	
	public static void main(String[] args) {
		int t[][] = new int[4][4];
		introducir(t);
		visualizar(t);
		trasponer(t);
		visualizar(t);
	}
	
	private static void introducir(int[][] t) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[0].length; j++) {
				System.out.print("T["+i+"]["+j+"]: ");
				t[i][j] = scn.nextInt();
			}
		}
	}

	private static void trasponer(int[][] t) {
		for (int i=0; i<t.length; i++) {
			for (int j=i; j<t.length; j++) {
				int aux = t[i][j]; 
				t[i][j] =  t[j][i];
				t[j][i] = aux;
			}
		}
	}
	
	private static void visualizar(int[][] t) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[0].length; j++) {
				System.out.print("\t" + t[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
