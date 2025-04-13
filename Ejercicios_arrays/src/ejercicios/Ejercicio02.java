package ejercicios;


public class Ejercicio02 {
	
	/*Escribir una tabla con los 10 primeros números primos y los visualice.*/
	
	public static void main(String[] args) {
		int primos[] = new int[10];
		obtenerNumeros(primos);
		visualizar(primos);
	}
	
	public static void obtenerNumeros(int t[]) {
		int j = 0;
		for (int i=1; j <= 9; i++) {
			if (esPrimo(i)) {
				t[j++] = i;
			}
		}
	}
	
	public static boolean esPrimo(int n) {
		int i=2;
		while(i < n && n % i != 0) {
			i++;
		}
		return i == n ? true : false;
	}
	
	public static void visualizar(int t[]) {
		for (int i=0; i<t.length; i++) {
			System.out.println("T["+ (i+1) +"]: " + t[i]);
		}
	}
}
