package modelos;

//lazy class
//inline class
public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
    	// temporary field
    	// inline temp
        double sueldo=0;
        sueldo= prof.info.aniosdeTrabajo*600 + prof.info.BonoFijo;
        return sueldo;
    }  
}
