package ejercicio10;

public class Plaza {
	
	private Coche coche;
	private Moto moto;

	public Plaza() {
		coche = null;
		moto = null;
	}
	
	public Plaza(Coche coche) {
		this.coche = coche;
	}
	
	public Plaza(Moto moto) {
		this.moto = moto; 
	}
	
	public void visualizar() {
		if (coche == null) {
			moto.visualizar();
		} else {
			coche.visualizar();
		}
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}
}
