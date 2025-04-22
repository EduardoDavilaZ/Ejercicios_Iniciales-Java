package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	static Scanner scn = new Scanner(System.in);
	
	/*Los resultados a la últimas elección a alcalde en el pueblo X has sido los
	siguientes:
			DISTRITO CANDIDATO
		        A     B    C     D
		1	194   48   206   45
		2	180   20   320   16
		3	221   90   140   20
		4	432   50   821   14
		5	820   61   946   18
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
		int t[][] = new int[5][4];
		int v[] = new int [4];
		char c[] = {'A', 'B', 'C', 'D'};
		introducir(t);
		visualizar(t, c);
		calcular(t, v, c);
	}
	

	private static void introducir(int t[][]) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[0].length; j++) {
				System.out.print("T[" + i + "][" + j + "]: ");
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
	}
	
	private static void calcular(int[][] t, int[] v, char[] c) {
		int total = 0;
		
		for (int j = 0; j < v.length; j++) {
			for (int i = 0; i < t.length; i++) {
				v[j] += t[i][j];
			}
			total += v[j];
		}
		
		System.out.println("\nVotos totales por candidato:");
		int primero = -1, segundo = -1;
		for (int i = 0; i < v.length; i++) {
			double porcentaje = v[i] * 100.0 / total;
			System.out.printf("Candidato %c: %d votos (%.2f%%)\n", c[i], v[i], porcentaje);
		}

		int a = 0, b = -1;
		for (int i = 1; i < v.length; i++) {
			if (v[i] > v[a]) {
				b = a;
				a = i;
			} else if (b == -1 || v[i] > v[b]) {
				b = i;
			}
		}
		
		double ganador = v[a] * 100.0 / total;
		System.out.println();
		if (ganador > 50) {
			System.out.println("Candidato más votado: " + c[a] + " con más del 50% de votos.");
		} else {
			System.out.println("Segunda vuelta entre: " + c[a] + " y " + c[b]);
		}
	}
}
