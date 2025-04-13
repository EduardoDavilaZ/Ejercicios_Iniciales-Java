package ejercicios3;

import java.util.Scanner;

public class Ejercicio21 {
	static Scanner t = new Scanner(System.in);
	/*Escribir un programa que visualice la siguiente salida:

	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3
	1 2
	1*/
	
	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		int n = t.nextInt();
		
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++) {
				if (i >= j / 2 && i < n / 2 && j % 2 == 0 || j / 2 < n - i && i >= n / 2 && j % 2 == 0) {
					System.out.print(j / 2 + 1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}