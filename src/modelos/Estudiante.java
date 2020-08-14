package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    public String matricula;
    public ArrayList<Paralelo> paralelos;
    
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double calcularNota(Paralelo p, Nota n) {
        double nota = 0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
            	nota = n.calcularNota();
            }
        }
        return nota;
    }
    
    public double calcularNotaTotal(Paralelo p){
        double notaTotal = 0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal = p.getMateria().calcularNotaTotal();    
            }
        }
        return notaTotal;  
    }
}
        
    
    
    
            
        
        
