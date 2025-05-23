package ejercicios2;

import java.util.Scanner;

public class Ejercicio12 {
	static Scanner scn = new Scanner(System.in);

	/*Escribir un programa que visualice un cuadrado mágico de orden impar n,
	comprendido entre 3 y 11; el usuario elige el valor de n. Un cuadrado mágico se
	compone de números enteros comprendidos entre 1 y n2. La suma de los
	números que figuran en cada línea, cada columna y cada diagonal son idénticos.
	Un ejemplo es:
	
	8 	1 	6
	3 	5 	7
	4 	9	2
	
	Un método de construcción del cuadrado consiste en situar el número 1 en el
	centro de la primera línea, el número siguiente en la casilla situada encima y a la
	derecha y así sucesivamente. Es preciso considerar que el cuadrado se cierra sobre si
	mismo; la línea encima de la primera es realmente la última y la columna a la
	derecha de la última es la primera. Sin embargo, cuando la posición del número
	caiga en una casilla ocupada, se elige la casilla situada debajo del número que acaba
	de ser situado.*/
	
	public static void main(String[] args) {
		int n = dimensionar();
		int t[][] = new int[n][n];
		crearCuadrado(t, n);
		visualizar(t);
	}

	private static int dimensionar() {
		int n;
		do {
			System.out.print("Introduce: ");
			n = scn.nextInt();
		} while(n % 2 == 0 || n < 3 || n > 11);
		return n;
	}
	
	private static void crearCuadrado(int t[][], int n) {
		int i=0, j=(n-1)/2, c = 1;
		while (c <= n*n) {
			t[i][j] = c;
			c++;
			
			int ii = i - 1;
			int jj = j + 1;
			
			if (ii < 0) ii = n - 1;
			if (jj == n) jj = 0;
			
			if (t[ii][jj] == 0) {
				i = ii;
				j = jj;
			} else {
				i += 1;
			}
		}
	}

	private static void visualizar(int t[][]) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t.length; j++) {
				System.out.print("\t" + t[i][j]);
			}
			System.out.println();
		}
	}
}
