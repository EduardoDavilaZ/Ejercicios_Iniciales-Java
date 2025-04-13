package ejercicios1;

import java.util.Scanner;

public class Ejercicio06 {
	static Scanner t = new Scanner(System.in);
	/*Elaborar, un algoritmo que permitan calcular el máximo común divisor de dos
	números enteros positivos. NOTA: Busca información sobre el algoritmo de
	Euclides*/
	
	public static void main(String[] args) {
		System.out.print("Primer numero: ");
		int a = t.nextInt();
		System.out.print("Segundo numero: ");
		int b = t.nextInt();
		System.out.println("M.C.D. : " + euclides(a, b));
	}

	public static int euclides(int a, int b) {
		if (a % b == 0) return b;
		int aux = a % b;
		return euclides(b, aux);
	}
}
