package ejercicios3;

import java.util.Scanner;

public class Ejercicio25 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un programa para mostrar, mediante bucles, los códigos ASCII de las
	letras mayúsculas y minúsculas.*/
	
	public static void main(String[] args) {
		for (int i=65; i<=90; i++) {
			System.out.print((char) i);
		}
		System.out.println();
		for (int i=97; i<=122; i++) {
			System.out.print((char) i);
		}
	}
}