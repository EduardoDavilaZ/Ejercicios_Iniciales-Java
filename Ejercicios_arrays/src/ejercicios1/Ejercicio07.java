package ejercicios1;

import java.util.Scanner;

public class Ejercicio07 {
	static Scanner scn = new Scanner(System.in);
	
	/*Se dice que una matriz tiene un punto de silla si alguna posición de la matriz es
	el menor valor de su fila, y a la vez el mayor de su columna. Escribir un
	programa que tenga como entrada una matriz de números reales y calcular la
	posición de un punto de silla (si es que existe).*/
	
	public static void main(String[] args) {
		int[][] t = new int[4][4];
		introducir(t);
		puntoSilla(t);
	}

	public static void introducir(int[][] t) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print("T[" + i + "][" + j + "]: ");
				t[i][j] = scn.nextInt();
			}
		}
	}

	public static void puntoSilla(int[][] t) {
		for (int i = 0; i < 4; i++) {
			int min = t[i][0];
			int col = 0;

			for (int j = 1; j < 4; j++) {
				if (t[i][j] < min) {
					min = t[i][j];
					col = j;
				}
			}

			boolean esMayor = true;
			for (int fila = 0; fila < 4; fila++) {
				if (t[fila][col] > min) {
					esMayor = false;
					break;
				}
			}

			if (esMayor) {
				System.out.println("\nT[" + i + "][" + col + "]: " + min + " es un punto de silla.");
				return;
			}
		}
		System.out.println("\nNo hay punto de silla.");
	}
}