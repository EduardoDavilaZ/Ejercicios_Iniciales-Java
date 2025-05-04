package Ejercicio02;

public class Main {

	/*Resolver la ecuación de segundo grado ax2 + bx +c = 0. Sabiendo que si a = 0 no se puede
	hacer y si el discriminante es negativo (b2 < 4ac) tampoco.*/
	
	public static void main(String[] args) {
		Ecuacion ec = new Ecuacion();
		ec.introducir();
		try {
            if (ec.getA() == 0) {
                throw new MiExcepcion("No se puede hacer (a = 0)");
            }

            double d = (ec.getB() * ec.getB()) - (4 * ec.getA() * ec.getC());
            if (d < 0) {
                throw new MiExcepcion("No se puede hacer (discriminante negativo)");
            }

            System.out.println("Primer resultado: " + ec.primerResultado());
            System.out.println("Segundo resultado: " + ec.segundoResultado());
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
	}
}