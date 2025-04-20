package ejercicio06;

import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ListaEnlazada le = new ListaEnlazada();
		
		int n;
		do {
			System.out.print("Agrega: ");
			n = scn.nextInt();
			if (n != 0) {
				le.introducir(n);
			}
		} while(n != 0);
		
		le.visualizar();
	}
}
