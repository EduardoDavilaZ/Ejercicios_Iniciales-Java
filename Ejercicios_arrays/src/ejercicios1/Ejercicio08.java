package ejercicios1;

import java.util.Scanner;

public class Ejercicio08 {
	static Scanner t = new Scanner(System.in);
	
	/*Crear una clase “Primitiva”, capaz de rellenar el juego de la primitiva
	(almacenar 6 números del 1 al 49).*/
	
	public static void main(String[] args) {
		int[] j = new int[7];
		int[] p = new int[7];
		
		turnoJugador(j);
		sorteo(p);
		resultados(j, p);
	}

	private static void turnoJugador(int[] j) {
		for (int i=0; i<j.length-1; i++) {
			do {
				System.out.print("T["+i+"]: ");
				j[i] = t.nextInt();
				if (j[i] > 49 || j[i] < 1) {
					System.out.println("Fuera de rango!");
				}
			} while(j[i] > 49 || j[i] < 1);
		}
		
		// Numero de reintegro
		j[6] = (int)(Math.random() * 10);
		ordenar(j);
		visualizar(j);
	}

	private static void sorteo(int[] p) {
		for (int i=0; i<p.length-1; i++) {
			p[i] = (int)(Math.random() * 50);
		}
		
		// Numero de reintegro
		p[6] = (int)(Math.random() * 10);
		ordenar(p);
		visualizar(p);
	}

	private static void resultados(int[] j, int[] p) {
		boolean gano = true;
		for (int i=0; i<j.length-1; i++) {
			if (j[i] != p[i]) {
				gano = false;
			}
		}
		if (gano) {
			System.out.println("Has ganado!");
		} else if (j[6] == p[6]) {
			System.out.println("Reintegro concedido!");
		} else {
			System.out.println("Vuelve a intentarlo");
		}
	}
	
	private static void visualizar(int[] tabla) {
		for (int i=0; i<tabla.length; i++) {
			if (i < tabla.length-1) {
				System.out.print("\t" + tabla[i]);
			} else {
				System.out.print("\t | Reintegro: " + tabla[i]);
			}
		}
		System.out.println();
	}
	
	private static void ordenar(int[] tabla) {
		for (int i=0; i<tabla.length-1; i++) {
			for (int j=0; j<tabla.length-i-2; j++) {
				if (tabla[j] > tabla[j+1]) {
					int aux = tabla[j];
					tabla[j] = tabla[j+1];
					tabla[j+1] = aux;
				}
			}
		}
	}
}
