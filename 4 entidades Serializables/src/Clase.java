
import java.io.Serializable;


public class Clase implements Serializable{
    int codClase;
    int numeroAlumnos;
    String asignatura;
    int instituto;

    public Clase(){
    }

    public Clase(int cod_clase, int numeroAlumnos, String asignatura, int instituto) {
        this.codClase = cod_clase;
        this.numeroAlumnos = numeroAlumnos;
        this.asignatura = asignatura;
        this.instituto = instituto;
    }

    public int getCod_clase() {
        return codClase;
    }

    public void setCod_clase(int cod_clase) {
        this.codClase = cod_clase;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getInstituto() {
        return instituto;
    }

    public void setInstituto(int instituto) {
        this.instituto = instituto;
    }

    @Override
    public String toString() {
        return "Clase{" + "cod_clase=" + codClase + ", numeroAlumnos=" + numeroAlumnos + ", asignatura=" + asignatura + ", instituto=" + instituto + '}';
    }
    
    
            
}
