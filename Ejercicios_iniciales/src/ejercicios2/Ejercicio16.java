package ejercicios2;

import java.util.Scanner;

public class Ejercicio16 {
	static Scanner t = new Scanner(System.in);
	
	public static final double pulgadas = 12; // 1 pie = 12 pulgadas
	public static final double yardas = 1.0 / 3; // 1 pie = 1/3 yardas
	public static final double centimetros = 30.48; // 1 pie = 30.48 cm
	public static final double metros = 0.3048; // 1 pie = 0.3048 metros
	
	/*Escribir un programa para convertir una medida en pies en su equivalente en:
	a. yardas
	b. pulgadas
	c. centímetros
	d. metros
	(1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2,54 cm, 1 m = 100 cm).
	Leer el número en pies y visualizar el número de yardas, pies, pulgadas,
	centímetros y metros.*/
	
	public static void main(String[] args) {
		System.out.print("Pies: ");
		double p = t.nextDouble();
		
		System.out.println("Pulgadas: " + calcular(p, pulgadas));
		System.out.println("Yardas: " + calcular(p, yardas));
		System.out.println("Centimetros: " + calcular(p, centimetros));
		System.out.println("Metros: " + calcular(p, metros));
	}
	
	public static double calcular(double pies, double unidad) {
		return pies * unidad;
	}
}
