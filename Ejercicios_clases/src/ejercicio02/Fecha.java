package ejercicio02;

import java.util.Scanner;

public class Fecha {

	private int dd;
	private int mm;
	private int aa;
	
	public Fecha() {
		this.dd = 0;
		this.mm = 0;
		this.aa = 0;
	}
	
	public void introducir() {
		Scanner t = new Scanner(System.in);
		System.out.print("Día: ");
		dd = t.nextInt();
		System.out.print("Mes: ");
		mm = t.nextInt();
		System.out.print("Año: ");
		aa = t.nextInt();
	}
	
	public void visualizar() {
		System.out.println(dd + "/" + mm + "/" + aa);
	}
	
	public boolean validarFecha() {
		if (mm < 1 || mm > 12 || dd < 1 || aa < 0)
			return false;

		if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
			if (dd > 31)
				return false;
		}

		if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
			if (dd > 30)
				return false;
		}

		if (mm == 2) {
			if (esBisiesto(aa)) {
				if (dd > 29)
					return false;
			} else {
				if (dd > 28)
					return false;
			}
		}
		return true;
	}
	
	public static boolean esBisiesto(int a) {
		return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
	}
}
