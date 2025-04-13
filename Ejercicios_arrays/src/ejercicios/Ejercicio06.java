package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	static Scanner scn = new Scanner(System.in);
	
	/*Los resultados a la últimas elección a alcalde en el pueblo X has sido los
	siguientes:
			DISTRITO CANDIDATO
		A 		B 		C 		D
	1 	194 	48 		206 	45
	2 	180 	20 		320 	16
	3 	221 	90 		140 	20
	4 	432 	50 		821 	14
	5 	820 	61 		946 	18
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
		introducir(t);
		visualizar(t);
	}

}
