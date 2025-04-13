package ejercicios2;

import java.util.Scanner;

public class Ejercicio20 {
	static Scanner t = new Scanner(System.in);
	
	/*Se desea calcular el salario neto semanal de los trabajadores de una empresa de
	acuerdo con a las siguientes normas:
	Horas semanales trabajadas menor 38, igual a una tasa dada.
	Horas extras( 38 o más) a una tasa 50% superior a la ordinaria.
	Impuestos 0%, si el salario bruto es menor o igual a 800€.
	Impuestos del 10%, si el salario bruto es mayor de 800€.*/
	
	public static void main(String[] args) {
		System.out.print("Salario por hora: ");
		double s = t.nextDouble();
		System.out.print("Horas semanales: ");
		int hs = t.nextInt();
		s = s * hs;
		if (hs >= 38) {
			s = s * 2;
		}
		if (s > 800) {
			s += s * 0.10;
		}
		System.out.println("Salario neto: " + s);
	}
}
