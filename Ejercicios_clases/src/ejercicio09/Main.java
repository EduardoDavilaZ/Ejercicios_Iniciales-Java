package ejercicio09;

public class Main {
	
	/*Crear una clase llamada empleado que contenga como miembro dato el nombre y el
	número de empleado, y como métodos miembros Leerdatos() y Verdatos() que lean los
	datos del teclado y los visualice en pantalla, respectivamente.
	Escribir un programa que utilice la clase, creando un array de tipo empleado y luego
	llenándolo con datos correspondientes a 5 empleados. Una vez rellenado el array,
	visualizar los datos de todos los empleados.*/

	public static void main(String[] args) {
		Empleado[] emp = new Empleado[5];
		introducir(emp);
		visualizar(emp);
	}
	
	private static void introducir(Empleado[] emp) {
		for (int i=0; i<emp.length; i++) {
			emp[i] = new Empleado();
			emp[i].leerDatos();
		}
	}
	
	private static void visualizar(Empleado[] emp) {
		for (int i=0; i<emp.length; i++) {
			emp[i].verDatos();
		}
	}
}