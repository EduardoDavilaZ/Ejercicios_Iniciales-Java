package ejercicio03;

import java.util.Scanner;

public class Oficina extends Edificio{
	
	private int extintores;
	private int telefonos;

	public Oficina() {}
	
	public void introducir() {
		Scanner scn = new Scanner(System.in);
		super.introducir();
		System.out.print("Extintores: ");
		extintores = scn.nextInt();
		System.out.print("Telefonos: ");
		telefonos = scn.nextInt();
	}

	public int getExtintores() {
		return extintores;
	}

	public void setExtintores(int extintores) {
		this.extintores = extintores;
	}

	public int getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(int telefonos) {
		this.telefonos = telefonos;
	}

	@Override
	public String toString() {
		return "Oficina [ " + super.toString() + " extintores = " + extintores + ", telefonos = " + telefonos + "]";
	}
}