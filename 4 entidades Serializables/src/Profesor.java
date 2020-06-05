
import java.io.Serializable;

public class Profesor implements Serializable{
    int codProfe;
    String nombre;
    String apellido;
    String dni;
    int clase;

    public Profesor() {
    }

    public Profesor(int cod_profe, String nombre, String apellido, String dni, int clase) {
        this.codProfe = cod_profe;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.clase = clase;
    }

    public Profesor(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    

    public int getCod_profe() {
        return codProfe;
    }

    public void setCod_profe(int cod_profe) {
        this.codProfe = cod_profe;
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

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getCodProfe() {
        return codProfe;
    }

    public void setCodProfe(int codProfe) {
        this.codProfe = codProfe;
    }
    
    

    @Override
    public String toString() {
        return "Profesor{" + "cod_profe=" + codProfe + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", clase=" + clase + '}';
    }
    
    
            
}
