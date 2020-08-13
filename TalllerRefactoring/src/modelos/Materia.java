package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    public Nota notaInicial;
    public Nota notaFinal;
    public double notaTotal;
    
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                
            }
        }
        return notaTotal;
        
    }
    
    
}
