package ejercicios2;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner t = new Scanner(System.in);
	/*Escribir un programa que dibuje el rectángulo siguiente:
	* *  *  *  **
	* 			*
	* 			*
	* 			*
	* * * * * * */
	
	public static void main(String[] args) {
		System.out.print("Introduce un número: ");
		int n = t.nextInt();
		
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n*3; j++) {
				if (i == n && j % 2 == 0 || i == 0 && j % 2 == 0 || j == n * 3 || j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
