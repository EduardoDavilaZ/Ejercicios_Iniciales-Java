package ejercicios3;

import java.util.Scanner;

public class Ejercicio28 {
	static Scanner t = new Scanner(System.in);
	
	/*Calcular todos los números de tres cifras tales que la suma de los cubos de las
	cifras es igual al valor del número.*/
	
	public static void main(String[] args) {
		int i = 100;
		
		while (i <= 999) {
			if (condicion(i)) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	private static boolean condicion(int n) {
		int t[] = new int[3];
		t[0] = n / 100;
		t[1] = n / 10 % 10;
		t[2] = n % 10; 
		
		int c = 0;
		for (int i=0; i<3; i++) {
			c += Math.pow(t[i], 3);
		}
		
		
		if (c == n) {
			return true;
		}
		
		return false;
	}
}
