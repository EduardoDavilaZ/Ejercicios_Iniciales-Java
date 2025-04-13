package ejercicios2;

import java.util.Scanner;

public class Ejercicio17 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un programa que introduzca una fecha correcta. Un año es bisiesto si es
	divisible por 400, o si es divisible por 4 pero no por 100.*/
	
	public static void main(String[] args) {
		int d, m, a;
		do {
			System.out.print("Dia: ");
			d = t.nextInt();
			System.out.print("Mes: ");
			m = t.nextInt();
			System.out.print("Año: ");
			a = t.nextInt();
			if (!validar(d, m, a)) {
				System.out.println("Fecha incorrecta");
			}
		} while(!validar(d, m, a));
		System.out.println("Fecha correcta");
	}

	private static boolean validar(int d, int m, int a) {
	    if (d < 1 || m < 1 || m > 12) return false;
	    if (d > 31) return false;

	    if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
	        if (d > 31) return false;
	    }

	    if (m == 4 || m == 6 || m == 9 || m == 11) {
	        if (d > 30) return false;
	    }

	    if (m == 2) {
	        if (esBisiesto(a)) {
	            if (d > 29) return false;
	        } else {
	            if (d > 28) return false;
	        }
	    }

	    return true;
	}
	
	private static boolean esBisiesto(int a) {
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) return true;
		return false;
	}
}
