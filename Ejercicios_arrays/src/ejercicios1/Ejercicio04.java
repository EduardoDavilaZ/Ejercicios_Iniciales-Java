package ejercicios1;

import java.util.Scanner;

public class Ejercicio04 {
	static Scanner scn = new Scanner(System.in);

	/*Entrar valores en un array de 4 x 4, e intercambiar los valores de la primera fila
	con los de la primera columna.*/
	
	public static void main(String[] args) {
		int[][] t = new int[4][4];
		
		introducir(t);
		visualizar(t);
		intercambiar(t);
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

	private static void intercambiar(int[][] t) {
		for (int i=0; i<t.length; i++) {
			int aux = t[i][0]; 
			t[i][0] =  t[0][i];
			t[0][i] = aux;
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
