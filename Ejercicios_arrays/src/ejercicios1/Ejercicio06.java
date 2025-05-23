package ejercicios1;

import java.util.Scanner;

public class Ejercicio06 {
	static Scanner scn = new Scanner(System.in);
	
	/*Los resultados a la últimas elección a alcalde en el pueblo X has sido los
	siguientes:
	DISTRITO CANDIDATO
	A 	B 	C 	D
	1 194 48 206 45
	2 180 20 320 16
	3 221 90 140 20
	4 432 50 821 14
	5 820 61 946 18
	Escribir un programa que haga las siguientes tareas:
	a) Visualizar la tabla anterior con cabeceras incluidas.
	b) Calcular y visualizar el número total de votos recibidos por cada candidato y
	el porcentaje del total de votos emitidos. Asimismo, visualizar el candidato
	más votado.
	c) Si algún candidato recibe más del 50% de los votos, el programa visualizará
	el candidato más votado.
	d) Si ningún candidato recibe más del 50% de los votos, el programa debe
	visualizar el nombre de los dos candidatos más votado, que serán los que
	pasen a una segunda ronda de elecciones.*/
	
	public static void main(String[] args) {
		int[][] t = new int[5][4];
		char[] c = {'A', 'B', 'C', 'D'};
		
		introducir(t);
		visualizar(t, c);
		calcular(t, c);
	}

	private static void introducir(int[][] t) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[0].length; j++) {
				System.out.print("T["+i+"]["+j+"]: ");
				t[i][j] = scn.nextInt();
			}
		}
	}

	private static void visualizar(int[][] t, char[] c) {
		for (int i=0; i<c.length; i++) {
			System.out.print("\t" + c[i]);
		}
		System.out.println();
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[0].length; j++) {
				System.out.print("\t" + t[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void calcular(int[][] t, char c[]) {
		int[] v = new int[4];
		
		votosPorCandidato(t, v);
		int total = votosTotales(v);
		porcentajeDeVotos(v, c, total);
	}
	
	private static void votosPorCandidato(int t[][], int v[]) {
		for (int i=0; i<t.length - 1; i++) {
			for (int j=0; j<t.length - 1; j++) {
				v[j] += t[j][i];
			}
		}
	}
	
	private static int votosTotales(int v[]) {
		int total = 0;
		for (int i=0; i<4; i++) {
			total += v[i];
		}
		return total;
	}
	
	private static void porcentajeDeVotos(int v[], char c[], int total) {
		int max1 = 0, max2 = 0;
		for (int i=0; i<v.length; i++) {
			System.out.println("Candidato " + c[i] + ": " + v[i] * 100 / total);
			if (v[i] * total / 100 > max2){
				max2 = v[i] * total / 100;
			}
			
			if (max2 > max1) {
				int aux = max1;
				max1 = max2;
				max2 = aux;
			}
		}
		
		if (max1 > 50) {
			System.out.println("Porcentaje ganador = " + max1);
		} else {
			System.out.println("Segunda vuelta = " + max1 + " y " + max2);
		}
	}
}