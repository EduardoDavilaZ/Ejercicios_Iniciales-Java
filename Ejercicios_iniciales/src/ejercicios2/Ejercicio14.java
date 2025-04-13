package ejercicios2;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner t = new Scanner(System.in);
	/*Escribir un programa que dibuje el triángulo siguiente:

		     *
		  *    *
		*        *
	  *            *
	* * * * * * * * **/
	
	public static void main(String[] args) {
		System.out.print("Introduce un número: ");
		int n = t.nextInt();
		
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n*4; j++) {
				if (i == n && j % 4 == 0 || j - n == n + i * 2  || j - n == n - i * 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
