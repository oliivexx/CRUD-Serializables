
import java.io.Serializable;


public class Alumno implements Serializable{
    int codAlumn;
    String nombre;
    String apellido;
    String dni;
    int profesor;

    public Alumno() {
    }

    public Alumno(int codAlumn, String nombre, String apellido, String dni, int profesor) {
        this.codAlumn = codAlumn;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.profesor = profesor;
    }

    public int getCodAlumn() {
        return codAlumn;
    }

    public void setCodAlumn(int codAlumn) {
        this.codAlumn = codAlumn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codAlumn=" + codAlumn + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", profesor=" + profesor + '}';
    }
    
    
}
