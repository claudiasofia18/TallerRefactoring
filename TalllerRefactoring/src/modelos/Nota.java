package modelos;

public class Nota {
	
	double nexamen;
	double ndeberes;
	double nlecciones;
	double ntalleres;
	
	
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
	
	
//Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    //long parameter list
    // introduce parameter objects
    public double CalcularNotaInicial(Paralelo p, Nota nota){
        double notaInicial=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nota.getNotaExamen()+nota.getNotaDeberes()+nota.getNotaLecciones())*0.80;
                double notaPractico=(nota.getNotaTalleres())*0.20;
                notaInicial=notaTeorico+notaPractico;
            }
        }
        return notaInicial;
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    //long parameter list
    // introduce parameter objects
    public double CalcularNotaFinal(Paralelo p, Nota nota){
        double notaFinal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
            	double notaTeorico=(nota.getNotaExamen()+nota.getNotaDeberes()+nota.getNotaLecciones())*0.80;
                double notaPractico=(nota.getNotaTalleres())*0.20;
                notaFinal=notaTeorico+notaPractico;
            }
        }
        return notaFinal;
    }
}






