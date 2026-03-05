package logica;

public class Profesor {
    //atributos
    private String nombre;

    //constructores
    public Profesor() {
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }
    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //sobre-escritura
    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + "]";
    }
    public void ensenar(Estudiante estudiante){
        System.out.println("el profesor "+
        this.nombre+" enseña al estudiante "+estudiante);

    }
    

    
}
