package ejercicios1;

import java.util.Scanner;

public class Ejercicio08 {
	static Scanner scn = new Scanner(System.in);
	
	/*Dada una medida de tiempo expresada en horas, minutos y segundos con
	valores arbitrarios, elabore un programa que transforme dicha medida en una
	expresión correcta. Por ejemplo, dada la medida 3h 118m 195s, el programa
	deberá obtener como resultado 5h 1m 15s.*/
	
	public static void main(String[] args) {
		
		System.out.print("Horas: ");
		int h = scn.nextInt();
		System.out.print("Minutos: ");
		int m = scn.nextInt();
		System.out.print("Segundos: ");
		int s = scn.nextInt();
		
		int[] t = {h, m, s};
		corregirExpresion(t);

        System.out.println("Hora corregida: " + t[0] + ":" + t[1] + ":" + t[2]);
    }

    public static void corregirExpresion(int[] t) {
    	t[1] += t[2] / 60;
        t[2] = t[2] % 60;
        t[0] += t[1] / 60; 
        t[1] = t[1] % 60; 
    }
}
