package ejercicio05;

import java.util.Scanner;

public class Fecha {

	private int dd;
	private int mm;
	private int aa;
	
	// Constructor por defecto
	public Fecha() {
		this.dd = 1;
		this.mm = 1;
		this.aa = 2000;
	}
	
	// Constructor parametrizado
	public Fecha(int dd, int mm, int aa) {
		this.dd = dd;
		this.mm = mm;
		this.aa = aa;
	}
	
	// Función de acceso
	public void introducir() {
		Scanner scn = new Scanner(System.in);
		do {
			System.out.print("Día: "); dd = scn.nextInt();
			System.out.print("Mes: "); mm = scn.nextInt();
			System.out.print("Año: "); aa = scn.nextInt();
			if (!validarFecha()) {
				System.out.println("Vuelva a introducir");
			}
		} while(!validarFecha());
	}
	
	public void visualizar() {
		System.out.println("Fecha: " + dd + "/" + mm + "/" + aa);
	}
	
	public void reiniciar() {
		dd = 1;
		mm = 1;
		aa = 1900;
	}
	
	public void adelantar(int n) {
		for (int i=0; i<n; i++) {
			dd++;
			if (!validarFecha()) {
				dd = 1;
				mm++;
				if (!validarFecha()) {
					mm = 1;
					aa++;
				}
			}
		}
	}
	
	public boolean validarFecha() {
		if (mm < 1 || mm > 12 || dd < 1 || aa < 0) return false;

		if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
			if (dd > 31) return false;
		}

		if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
			if (dd > 30) return false;
		}

		if (mm == 2) {
			if (esBisiesto(aa)) {
				if (dd > 29) return false;
			} else {
				if (dd > 28) return false;
			}
		}
		return true;
	}
	
	public static boolean esBisiesto(int a) {
		return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}
}
