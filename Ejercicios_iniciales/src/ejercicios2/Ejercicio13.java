package ejercicios2;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner t = new Scanner(System.in);
	
	/*El Domingo de Pascua es el primer domingo después de la primera luna llena
	posterior al equinoccio de primavera, y se determina mediante el siguiente
	cálculo sencillo.
	a. Sea Y el año. (apliquémoslo por ejemplo al año 2000) N = Y-1900 = 100
	b. Se divide N entre 19, sea A el resto de la división: A = 5
	c. Se divide (7*A+ 1) entre 19. Sea B el cociente entero: B = 1
	d. Se divide (11*A +( 4-B)) entre 29. Sea M el resto: M = 0
	e. Se divide N entre 4. Sea Q el cociente: Q = 25
	f. Se divide (N+Q+31-M) entre 7. Sea W el resto: W = 2
	g. La fecha de la Pascua es R = 25-M-W. En el ejemplo será, por tanto, R = 23.
	
	i. Si el resultado R es positivo, caerá en abril.
	ii. Si el resultado es negativo, caerá en marzo, interpretando 0 como 31 de
	marzo, -1 como 30 de marzo y así hasta -9 que es el 22 de marzo, es decir, P =
	31 +R
	
	Construir un programa que tenga como entrada un año y determine la fecha del
	Domingo de Pascua.
	Nota: Utilizar el operador ternario ? : para seleccionar.*/
	
	public static void main(String[] args) {
		System.out.println("Introduce el año: ");
		int anyo = t.nextInt();
		int dia = calcular(anyo);
		
		if (dia > 0) {
            System.out.print("Será el " + dia + " de abril");
        } else {
        	if (esBisiesto(anyo)){
        		System.out.print("Será el " + (dia + 1) + " de marzo");
        	} else {
        		System.out.print("Será el " + dia + " de marzo");
        	}
        }
	}
	
	public static int calcular(int anyo) {
        int n = anyo - 1900; // a
        int a = n % 19; // b
        int b = (7 * a + 1) / 19; // c
        int m = (11 * a + (4 - b)) % 29; // d
        int q = n / 4; // e
        int w = (n + q + 31 - m) % 7; // f
        int r = 25 - m - w; // g
        return r;
    }
	
	public static boolean esBisiesto(int anyo) {
		if (anyo % 4 == 0) return true;
		return false;
	}
}
