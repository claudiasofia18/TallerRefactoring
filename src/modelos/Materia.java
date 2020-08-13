package modelos;

import java.util.List;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    public Nota notaInicial;
    public Nota notaFinal;
    public double notaTotal;
    
    public double calcularNotaTotal() {
    	return (notaInicial.calcularNota()+notaFinal.calcularNota())/2;
    } 
}
