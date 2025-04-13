package ejercicios1;

import java.util.Scanner;

public class Ejercicio09 {
	static Scanner t = new Scanner(System.in);
	
	/*Escriba un programa en Java que nos calcule el cambio que debe dar la caja de
	un supermercado: Dado un precio y una cantidad de dinero, el programa nos
	dirá cuántas monedas deben darse como cambio de tal forma que el número
	total de monedas sea mínimo.*/
	
	public static void main(String[] args) {
		
		System.out.println("Precio: ");
		int p = t.nextInt();
		System.out.println("Cantidad: ");
		int c = t.nextInt();
		
		int cambio = c - p;
        if (cambio < 0) {
            System.out.println("Dinero insuficiente");
        } else {
            System.out.println("Cambio a devolver: " + cambio + " euros");
            calcularCambio(cambio * 100);
        }
    }

    public static void calcularCambio(int t) {
        int[] monedas = {200, 100, 50, 20, 10, 5, 2, 1}; // monedas expresadas en céntimos
        for (int i = 0; i < monedas.length; i++) {
            int moneda = monedas[i];

            if (t >= moneda) {
                int cantidad = t / moneda;
                t = t % moneda;
                System.out.println(cantidad + " monedas de " + (moneda / 100.0) + "€");
            }
        }
    }
}
