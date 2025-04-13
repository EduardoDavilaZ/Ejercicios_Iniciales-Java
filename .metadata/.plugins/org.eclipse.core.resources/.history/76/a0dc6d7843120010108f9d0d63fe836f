package ejercicios2;

import java.util.Scanner;

public class Ejercicio19 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un programa que lea tres enteros positivos día, mes, anyo y a
	continuación visualice la fecha que represente, el número de días, del mes y
	una frase que diga si el año es o no bisiesto. Por ejemplo, 4/11/1999 debe
	visualizar 4 de noviembre de 1999. Ampliar el programa de modo que calcule la
	fecha correspondiente a 100 días más tarde.*/
	
	public static void main(String[] args) {
		int f[] = new int[3];
		System.out.println("Introducir fecha");
		do {
			System.out.print("Dia: ");
			f[0] = t.nextInt();
			System.out.print("Mes: ");
			f[1] = t.nextInt();
			System.out.print("Año: ");
			f[2] = t.nextInt();
			if (!validar(f)) {
				System.out.println("Fecha no válida");
			}
		} while(!validar(f));
			
		visualizarFecha(f);
		if (esBisiesto(f[2])) {
			System.out.println("Es bisiesto");
		} else {
			System.out.println("No es bisiesto");
		}
		aumentarDias(f, 100);
	}
	
	public static boolean validar(int f[]) {
		if (f[1] == 1 || f[1] == 3 || f[1] == 5 || f[1] == 7 || f[1] == 8 || f[1] == 10 || f[1] == 12) {
			if (f[0] > 31) return false;
		}
		if (f[1] == 4 || f[1] == 6 || f[1] == 9 || f[1] == 11) {
			if (f[0] > 30) return false;
		}
		if (f[1] == 2) {
			if (esBisiesto(f[2])) {
				if (f[0] > 29) return false; 
			} else {
				if (f[0] > 28) return false;
			}
		}
		return true;
	}
	
	public static boolean esBisiesto(int a) {
		return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
	}
	
	public static void visualizarFecha(int f[]) {
	    String fecha = "Fecha: " + f[0] + " de ";
	    switch (f[1]) {
	        case 1: fecha += "enero"; break;
	        case 2: fecha += "febrero"; break;
	        case 3: fecha += "marzo"; break;
	        case 4: fecha += "abril"; break;
	        case 5: fecha += "mayo"; break;
	        case 6: fecha += "junio"; break;
	        case 7: fecha += "julio"; break;
	        case 8: fecha += "agosto"; break;
	        case 9: fecha += "septiembre"; break;
	        case 10: fecha += "octubre"; break;
	        case 11: fecha += "noviembre"; break;
	        case 12: fecha += "diciembre"; break;
	        default: fecha += "mes inválido"; break;
	    }
	    fecha += " de " + f[2];
	    System.out.println(fecha);
	}

	public static void aumentarDias(int f[], int n) {
	    while (n > 0) {
	        f[0]++;
	        if (!validar(f)) {
	            f[0] = 1;
	            f[1]++;
	            if (f[1] > 12) {
	                f[1] = 1;
	                f[2]++;
	            }
	        }
	        n--;
	    }
	    System.out.println("Fecha tras aumentar 100 días:");
	    visualizarFecha(f);
	}
}