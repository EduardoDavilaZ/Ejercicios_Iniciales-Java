package ejercicios2;

import java.util.Scanner;

public class Ejercicio11 {
	static Scanner t = new Scanner(System.in);
	
	/*Un banco recibe todos los días del Banco Mundial una lista de cómo está el
	cambio de las divisas del mundo respecto del dólar americano (USD). Diseñar
	un algoritmo que, a partir de una cantidad de dólares que deseamos comprar,
	nos devuelva la cantidad en euros (y en pesetas) que nos costarían esos dólares.
	Suponga que el banco obtiene en el cambio un tanto por ciento variable de
	beneficios. NOTA: 1 euro = 166.386 pesetas.*/
	
	public static final double euros = 0.92; // dolares -> euros
	public static final double pesetas = 152.63; // dolares -> pesetas
	
	public static void main(String[] args) {
		System.out.print("Cantidad en USD: ");
		double d = t.nextDouble();
		
		System.out.println("Euros: " + convertir(d, euros));
		System.out.println("Pesetas: " + convertir(d, pesetas));
	}
	
	public static double convertir(double dolares, double moneda) {
		return dolares * moneda;
	}

}
