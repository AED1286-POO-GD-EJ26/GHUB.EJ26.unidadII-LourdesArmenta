package logica;

public class Vehiculo {
    //atributos
    private int id;
    private String titulo;
    //Constructores
    public Vehiculo() {
    }
    public Vehiculo(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    //getter y setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Vehiculo [id=" + id + ", titulo=" + titulo + "]";
    }
    
    
}
