package ejercicios1;

import java.util.Scanner;

/*Utilizar el teorema de Pitágoras para encontrar el valor de la hipotenusa. Usar el
método sqrt() definido en la clase estándar Math; sqrt admite como parámetros
dos valores double y devuelve un valor double. Los valores de los catetos son 2
y 3.*/

public class Ejercicio03 {
	static Scanner t = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Primer cateto: ");
		double c1 = t.nextDouble();
		System.out.print("Primer cateto: ");
		double c2 = t.nextDouble();
		
		double h = calcular(c1, c2);
		System.out.println("Hipotenusa: " + h);
	}

	private static double calcular(double c1, double c2) {
		return Math.sqrt((c1 * c1) + (c2 * c2));
	}
}
