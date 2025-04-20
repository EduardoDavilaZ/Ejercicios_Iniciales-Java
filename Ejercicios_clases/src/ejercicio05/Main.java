package ejercicio05;

public class Main {

	public static void main(String[] args) {
		Fecha fecha = new Fecha();
		fecha.introducir();
		fecha.visualizar();
		fecha.adelantar(50);
		fecha.visualizar();
		fecha.reiniciar();
		fecha.visualizar();
	}
}