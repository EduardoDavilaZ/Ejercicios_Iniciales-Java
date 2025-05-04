package Ejercicio01;

import java.util.Scanner;

public class Main {
	
	/*Hacer un programa que resuelva la división entre 0, con dividendo y divisor introducidos
	desde teclado.*/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Primer número: ");
		int a = scn.nextInt();
		System.out.print("Segundo número: ");
		int b = scn.nextInt();
		
		try {
			System.out.println("Resultado: " +  a / b);
		} catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
		}
	}
}