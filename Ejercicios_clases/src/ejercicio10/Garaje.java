package ejercicio10;

public class Garaje {
	
	private int numPlazas;
	private Plaza[] plazas;

	public Garaje() {
		numPlazas = 1;
	}
	
	public Garaje(int numPlazas) {
		this.numPlazas = numPlazas;
		this.plazas = new Plaza[numPlazas];
	}
	
	public void agregarPlaza(Plaza nuevaPlaza) {
		for (int i = 0; i < plazas.length; i++) {
			if (plazas[i] == null) {
				plazas[i] = nuevaPlaza;
				return;
			}
		}
		return;
	}
	
	public void visualizarPlaza() {
		for (int i = 0; i < plazas.length; i++) {
			if (plazas[i].getCoche() != null) {
				System.out.println("- Coche: ");
			} else {
				System.out.println("- Moto: ");
			}
			plazas[i].visualizar();
		}
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public Plaza[] getPlazas() {
		return plazas;
	}

	public void setPlazas(Plaza[] plazas) {
		this.plazas = plazas;
	}
}