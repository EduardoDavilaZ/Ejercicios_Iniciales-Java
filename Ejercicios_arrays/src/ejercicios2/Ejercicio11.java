package ejercicios2;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner scn = new Scanner(System.in);
	
	/*Escribir un programa que permita visualizar el triángulo de Pascal:

	       1
	      1 1
	     1 2 1
	    1 3 3 1
	   1 4 6 4 1
	 1 5 10 10 5 1
	1 6 15 20 15 6 1
	El triángulo de Pascal cada número es la suma de dos números situados encima
	de él. Este problema se debe resolver utilizando un array de dos dimensiones con
	número de columnas variables.*/
	
	public static void main(String[] args) {
		int n = dimensionar();
		int t[][] = new int[n][];
		
		crearArrays(t, n);
		visualizar(t, n);
	}
	
	public static int dimensionar() {
		System.out.print("Tamaño: ");
		return scn.nextInt();
	}
	
	public static void crearArrays(int t[][], int n) {
		for (int i=0; i<n; i++) {
			t[i] = new int[i+1];
		}
	}
	
	public static void visualizar(int t[][], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ".repeat((n - i - 1) * 2));
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					t[i][j] = 1;
				} else {
					t[i][j] = t[i - 1][j - 1] + t[i - 1][j];
				}
				System.out.print(t[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
