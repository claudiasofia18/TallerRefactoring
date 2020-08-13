package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
  
    public ArrayList<Paralelo> paralelos;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
       this.matricula = matricula;
    }

   
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
