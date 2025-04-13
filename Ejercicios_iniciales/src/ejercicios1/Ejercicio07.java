package ejercicios1;

import java.util.Scanner;

public class Ejercicio07 {
	static Scanner t = new Scanner(System.in);
	/*Diseñe un programa que lea los coeficientes de una ecuación de segundo grado
	ax2+bx+c=0 y calcule sus dos soluciones. Se supone que la ecuación tiene
	soluciones reales.*/
	
	public static void main(String[] args) {
		
		System.out.print("Primer numero: ");
		int a = t.nextInt();
		System.out.print("Segundo numero: ");
		int b = t.nextInt();
		System.out.print("tercer numero: ");
		int c = t.nextInt();
		
		System.out.println("Primera solución: " + solucion(a, b, c, 1));
		System.out.println("Segunda solución: " + solucion(a, b, c, 2));
	}
	
	private static double solucion (int a, int b, int c, int solucion) {
		if (solucion == 1) return (double) ((b * -1) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		return (double) ((b * -1) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
	}

}
