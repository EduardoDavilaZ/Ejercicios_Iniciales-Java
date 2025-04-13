package ejercicios3;

import java.util.Scanner;

public class Ejercicio27 {
	static Scanner t = new Scanner(System.in);
	
	/*Encontrar y mostrar todos los números de cuatro cifras que cumplen la
	condición de que la suma de las cifras de orden impar es igual a la suma de las
	cifras de orden par.*/
	
	public static void main(String[] args) {
		int i = 1000;
		
		while (i <= 9999) {
			if (condicion(i)) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	private static boolean condicion(int n) {
		int t[] = new int[4];
		t[0] = n / 1000;
		t[1] = n / 100 % 10;
		t[2] = n / 10 % 10;
		t[3] = n % 10; 
		
		if (t[0] + t[2] == t[1] + t[3]) {
			return true;
		}
		
		return false;
	}
}
