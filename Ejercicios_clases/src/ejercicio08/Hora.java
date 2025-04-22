package ejercicio08;

import java.util.Scanner;

public class Hora {
	
	private int hh;
	private int mm;
	private int ss;

	public Hora() {
		hh = 0;
		mm = 0;
		ss = 0;
	}
	
	public Hora(int hh, int mm, int ss) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	
	public void introducir() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Horas: ");
		hh = scn.nextInt();
		System.out.print("Minutos: ");
		mm = scn.nextInt();
		System.out.print("Segundos: ");
		ss = scn.nextInt();
	}
	
	public void sumar(Hora hora2) {
		hh += hora2.getHh();
		mm += hora2.getMm();
		ss += hora2.getSs();
		ordenar();
	}
	
	private void ordenar() {
		mm += ss / 60;
		ss = ss % 60;
		hh += mm / 60;
		mm = mm % 60;
	}

	public int getHh() {
		return hh;
	}

	public void setHh(int hh) {
		this.hh = hh;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getSs() {
		return ss;
	}

	public void setSs(int ss) {
		this.ss = ss;
	}

	@Override
	public String toString() {
		return "Hora [" + hh + ":" + mm + ":" + ss + "]";
	}
}
