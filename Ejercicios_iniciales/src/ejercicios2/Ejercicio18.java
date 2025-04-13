package ejercicios2;

import java.util.Scanner;

public class Ejercicio18 {
	static Scanner t = new Scanner(System.in);
	
	/*Diseñar e implementar un programa que solicite al usuario una entrada como un
	dato tipo fecha y a continuación visualice el número del día correspondiente del
	año. ejemplo si la fecha es 23 12 1999, el número visualizado será 357.*/
	
	public static void main(String[] args) {
		System.out.print("Introduce una fecha");
		System.out.print("Dia: ");
		int d = t.nextInt();
		System.out.print("Mes: ");
		int m = t.nextInt();
		System.out.print("Año: ");
		int a = t.nextInt();
		
		System.out.println("Dia del año: " + obtenerDias(d, m, a));
	}
	
	public static int obtenerDias(int d, int m, int a) {
		int dias = 0;
		int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i=0; i <= m - 2; i++) {
			dias += diasMes[i];
		}
		
		if (m > 2 && esBisiesto(a)) {
			dias += 1;
		}

		dias += d;
		return dias;
	}

	public static boolean esBisiesto(int a) {
		return (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0));
	}
}