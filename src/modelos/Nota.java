package modelos;

public class Nota {
	private double nexamen;
	private double ndeberes;
	private double nlecciones;
	private double ntalleres;
	
	
	public double getNotaExamen() {
		return nexamen;
	}
	
	public double getNotaDeberes() {
		return ndeberes;
	}
	
	public double getNotaLecciones() {
		return nlecciones;
	}
	
	public double getNotaTalleres() {
		return ntalleres;
	}

	public double calcularNota() {
		double notaTeorico = nexamen+ndeberes+nlecciones*0.80;
		double notaPractico = ntalleres*0.20;
		return notaTeorico+notaPractico;
	}
}






