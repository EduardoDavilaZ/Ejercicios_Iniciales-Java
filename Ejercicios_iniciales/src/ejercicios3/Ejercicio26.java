package ejercicios3;

import java.util.Scanner;

public class Ejercicio26 {
	static Scanner t = new Scanner(System.in);
	
	/*Diseñar un programa que produzca la siguiente salida:
	HGFEDCBA
	GFEDCBA
	FEDCBA
	ECBA
	CBA
	BA
	A  */
	
	public static void main(String[] args) {
		int[] l = new int[26];

		for (int i = 0; i < 26; i++) l[i] = 'Z' - i;
		
		for (int i = 0; i < 26; i++) {
            for (int j = i; j < 26; j++) {
                System.out.print((char) l[j]);
            }
            System.out.print("\n");
        }
	}
}
