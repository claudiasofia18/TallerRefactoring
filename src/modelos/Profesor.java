package modelos;

import java.util.ArrayList;

public class Profesor extends Persona {
    public String codigo;
    public int anosTrabajo;
    public double BonoFijo;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        super(nombre,facultad,edad,direccion,telefono,facultad);
    	this.codigo = codigo;
    	paralelos = new ArrayList<Paralelo>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    public double calcularSueldoProfesor() {
    	return anosTrabajo*600+BonoFijo;
    }
}
