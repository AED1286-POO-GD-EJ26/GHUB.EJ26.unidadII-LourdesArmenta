package logica;
public class Videojuego{
    //atributos
    private String id;
    private String titulo;
    private double precio;
    //constructores
    public Videojuego() {
    }
    public Videojuego(String id, String titulo, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Videojuego [id=" + id + ", titulo=" + titulo + ", precio=" + precio + "]";
    }
    
    

}