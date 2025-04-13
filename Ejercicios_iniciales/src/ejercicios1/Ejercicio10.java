package ejercicios1;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner t = new Scanner(System.in);
	
	/*El precio final de un producto para un comprador es la suma total del costo del
	producto, un porcentaje de beneficios que obtiene el vendedor y el I.V.A.
	Diseñar un algoritmo para obtener el precio final de un producto sabiendo su
	costo, el porcentaje de beneficios y el I.V.A. aplicable. Obtener el resultado
	redondeando a los cinco céntimos (p.ej. 5.94€ 5.95€).*/
	
	public static void main(String[] args) {
		System.out.print("Costo del producto: ");
		double c = t.nextDouble();
		System.out.print("Beneficio: ");
		double b = t.nextDouble();
		System.out.print("I.V.A.: ");
		double i = t.nextDouble();
		
		double p = calcular(c, b, i);
		System.out.print("Precio final: " + p);
	}
	
	private static double calcular (double c, double b, double i) {
		b = c * (b / 100);
		i = c * (i / 100);
		double r = redondear(c + b + i);
		return r;
	}
	
	private static double redondear(double r) {
	    while ((int) (r * 100) % 10 != 5 && (int) (r * 100) % 10 != 0) {
	        r += 0.01;
	    }
	    return r;
	}
}
