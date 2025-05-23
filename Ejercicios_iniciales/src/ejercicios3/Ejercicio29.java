package ejercicios3;

import java.util.Scanner;

public class Ejercicio29 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un programa, mediante métodos, que visualice un calendario de la
	forma:
	L M X J V S D
	1 2 3 4 5
	6 7 8 9 10 11 12
	13 14 15 16 17 18 19
	20 21 22 23 24 25 26
	27 28 29 30
	El usuario indica únicamente el mes y el año. La fórmula que permite conocer el
	día de la semana correspondiente a una fecha dada es:
	a) meses de enero o febrero
	n=a+31*(m-1)+d*(a-1)/4-3*((a+99)/100)/4;
	b) restantes meses
	n=a+31*(m-1)+d-(4*m+23)/10 + a/4-(3*(a/100+1)/4);
	donde a = año, m = mes, d = No del día del que queremos saber en que
	cae. (por ejemplo, d=15 me dirá en que día cae el 15 -lunes, martes, etc.- y por
	tanto si queremos saber el día en que empieza el mes d=1)
	Nota: n%7 indica el día de la semana (0= sábado, 1=domingo, 2=lunes,
	3=martes, etc.).
	Un año es bisiesto si es divisible por 400, o si es divisible por 4 pero no
	por 100.*/
	
	public static void main(String[] args) {
		System.out.print("Mes: ");
		int m = t.nextInt();
		System.out.print("Año: ");
		int a = t.nextInt();
		
		int n = calculo(m, a);
		visualizarCalendario(n, m, a);
	}
	
	private static int calculo(int m, int a) {
		int n;

		if (m == 1 || m == 2) {
			n = (a + 31 * (m - 1) + (1 * (a - 1)) / 4 - (3 * ((a + 99) / 100)) / 4);
		} else {
			n = (a + 31 * (m - 1) + 1 - (4 * m + 23) / 10 + a / 4 - (3 * ((a / 100 + 1)) / 4));
		}

		return n % 7;
	}
	
	private static void visualizarCalendario(int n, int m, int a) {
		int d = obtenerDias(m, a);
		System.out.println("\tD\tL\tM\tX\tJ\tV\tS");
		
		for (int i=0; i<n-1; i++) System.out.print("\t");
		
		for (int i=1; i<=d; i++, n++) {
			System.out.print("\t" + i);
			if (n % 7 == 0) {
				System.out.println();
			}
		}
	}
	
	public static boolean esBisiesto(int a) {
		return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
	}
	
	private static int obtenerDias(int m, int a) {
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			return 31;
		}
		
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			return 30;
		}
		
		if (m == 2) {
			if (esBisiesto(a)) {
				return 29;
			} else {
				return 28;
			}
		}
		
		return 0;
	}
	
}
