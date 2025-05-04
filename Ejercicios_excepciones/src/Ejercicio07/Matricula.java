package Ejercicio07;

import java.util.Arrays;

public class Matricula {
	
	private char letra;
	private char[] numero;

	public Matricula(char letra, char[] numero) {
		this.letra = letra;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Matricula [letra=" + letra + ", numero=" + Arrays.toString(numero) + "]";
	}

}
