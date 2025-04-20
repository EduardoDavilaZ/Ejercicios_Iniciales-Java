package ejercicio07;

import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);
	
	/*Crear una clase EMPLEADO que modele la información que una empresa mantiene
	sobre cada empleado: número de DNI (entero largo), sueldo base (real), pago de horas
	extras (real), horas extras realizadas en el mes (real), tipo (entero) de IRPF, casado o no
	(verdadero o falso) y número de hijos (entero). Al crear cada objeto se podrá
	proporcionar el DNI correspondiente. Los demás servicios que deberá proporcionar los
	objetos de la clase serán los siguientes:
		a. Cálculo y devolución del complemento correspondiente a las horas extras
			realizadas.
		b. Cálculo y devolución del sueldo bruto.
		c. Cálculo y devolución de las retenciones (IRPF) a partir del tipo, teniendo en
			cuenta que el porcentaje que hay que aplicar es el tipo menos 2 puntos si el
			empleado está casado y menos 1 punto por cada hijo que tenga; el porcentaje se
			aplica sobre el sueldo bruto.
		d. Visualización de la información básica del empleado.
		e. Visualización de toda la información del empleado, la básica más el sueldo
			base, el complemento por horas extras, el sueldo bruto, las retenciones de IRPF
			y el sueldo neto.*/

	public static void main(String[] args) {
		System.out.print("Introduce el dni: ");
		long dni = scn.nextLong();
		Empleado empleado = new Empleado(dni);
		empleado.introducir();
		empleado.informacionLaboral();
	}
}
