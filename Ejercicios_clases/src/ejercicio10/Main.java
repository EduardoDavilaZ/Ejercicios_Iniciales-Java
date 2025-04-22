package ejercicio10;

import java.util.Scanner;

public class Main {
	
	/*Dada la siguiente jerarquía de clase:	
	
	Vehículo
		public Vehiculo (int potencia);
		public int potencia ();
		
		Coche
			public Coche (int potencia, int numPlazas);
			public int numPlazas ();
		Moto
			public Moto (int potencia);
			
	Diseñar una clase Garaje que:
	 En el constructor se indica el número total de plazas de garaje.
	 En cada plaza se pueden guardar tanto un coche como una moto.
	 Tenga una función que devuelva la cuota mensual de una plaza:
		o 	Si en dicha plaza hay un coche, la cuota se calcula como la potencia
			multiplicada por el número de plazas.
		o 	Si en dicha plaza hay una moto, la cuota se calcula como la potencia
			multiplicada por 2.
		o 	Si no hay ningún vehículo en la plaza, la cuota es 0.*/

	public static void main(String[] args) {
		Garaje garaje = new Garaje(2);
		introducir(garaje);
		visualizar(garaje);
	}
	
	private static void introducir(Garaje garaje) {
		Scanner scn = new Scanner(System.in);
		int op;
		for (int i=0; i<garaje.getNumPlazas(); i++) {
			do {
				System.out.print("Aparcar un coche (1) o moto (2): ");
				op = scn.nextInt(); 
			} while(op != 1 && op != 2);
			
			if (op == 1) {
				agregarCoche(garaje);
			} else {
				agregarMoto(garaje);
			}
		}
	}
	
	private static void visualizar(Garaje garaje) {
		garaje.visualizarPlaza();
	}
	
	private static void agregarCoche(Garaje garaje) {
		Coche coche = new Coche();
		coche.introducir();
		Plaza plaza = new Plaza(coche);
		garaje.agregarPlaza(plaza);
	}

	private static void agregarMoto(Garaje garaje) {
		Moto moto = new Moto();
		moto.introducir();
		Plaza plaza = new Plaza(moto);
		garaje.agregarPlaza(plaza);
	}
}