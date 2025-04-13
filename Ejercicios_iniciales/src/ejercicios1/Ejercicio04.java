package ejercicios1;

public class Ejercicio04 {

	/*Realizar un programa que muestre las tablas de verdad de los 
	operadores lógicos.*/
	
	public static void main(String[] args) {

		System.out.println("OR");
		System.out.println("FALSE	| FALSE = " + operadorOr(false, false));
		System.out.println("FALSE 	| TRUE = " + operadorOr(false, true));
		System.out.println("TRUE	| FALSE = " + operadorOr(true, false));
		System.out.println("TRUE	| TRUE = " + operadorOr(true, false));
		
		System.out.println("AND");
		System.out.println("FALSE	| FALSE = " + operadorAnd(false, false));
		System.out.println("FALSE 	| TRUE = " + operadorAnd(false, true));
		System.out.println("TRUE	| FALSE = " + operadorAnd(true, false));
		System.out.println("TRUE	| TRUE = " + operadorAnd(true, true));
	}

	private static String operadorOr(boolean op1, boolean op2) {
		return op1 || op2 == true ? "TRUE" : "FALSE";
	}
	private static String operadorAnd(boolean op1, boolean op2) {
		return op1 && op2 == true ? "TRUE" : "FALSE";
	}
}
