package ejercicios1;

public class Ejercicio10 {
	
	/*Escribir un programa que encuentre los cuatro primeros números perfectos pares (no
	hay números perfectos impares).
	Un número perfecto es un entero positivo, que es igual a la suma de todos enteros
	positivos (excluidos el mismo) que son divisores del número. El primer número perfecto
	es 6, ya que los divisores de 6 son 1,2,3 y 1+2+3=6.*/
	
	public static void main(String[] args) {
		numerosPerfectos(4);
	}

	private static void numerosPerfectos(int n) {
		int i = 1, p = 0;
		while (p < n) {
			if (esPerfecto(i)) {
				System.out.println(i);
				p++;
			}
			i++;
		}
	}

	private static boolean esPerfecto(int n) {
		int s = 0;
		for (int i=1; i<n; i++) {
			if (n % i == 0) {
				s += i;
			}
		}
		return s == n ? true : false;
	}
}
