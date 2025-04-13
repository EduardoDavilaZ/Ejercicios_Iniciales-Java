package ejercicios3;

import java.util.Scanner;

public class Ejercicio24 {
	static Scanner t = new Scanner(System.in);
	
	/*Visualizar en pantalla una figura similar a la siguiente:
	*
	* *
	* * *
	* * * *
	* * * * **/
	
	public static void main(String[] args) {
		System.out.print("Introduce un número: ");
		int n = t.nextInt();
		
		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n*2; j++) {
				if (i > j / 2 && j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
