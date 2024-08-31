
package practico4_v2;

import java.util.HashSet;

public class Alumno {
    //atributos//
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    //constructo//

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }
    
    //get and set//

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public HashSet<Materia> getMaterias(){
        return materias;
    
    }    

    //metods//
    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }

    public void agregarMateria(Materia materia) {
        if (!materias.contains(materia)) {
            materias.add(materia);
        } else {
            System.out.println("El alumno ya esta inscripto en esta materia.");
        }
    }
    
    public int cantidadMaterias(){
        return materias.size();
    
    }

    @Override
    public String toString() {
        return legajo + " " + apellido + " " + nombre;
    }
}
