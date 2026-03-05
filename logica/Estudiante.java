package logica;

public class Estudiante {
    //atributos
    private String nombre;

    //constructores

    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    
    //sobreescritura
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + "]";
    }
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
