package logica;

public class Carrito {
    private String idVideos[];
    private int cantVideos[];
    private Videojuego[] videojuegos;
    private int tamanio;
    public Carrito(){
        this.idVideos = new String[10];
        this.cantVideos = new int[10];
        this.videojuegos = new Videojuego[10];
        this.tamanio = 0;
    }
    //getter 
    public String[] getIdVideos() {
        return idVideos;
    }
    public int[] getCantVideos() {
        return cantVideos;
    }
    public Videojuego[] getVideojuegos() {
        return videojuegos;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setIdVideos(String[] idVideos) {
        this.idVideos = idVideos;
    }
    public void setCantVideos(int[] cantVideos) {
        this.cantVideos = cantVideos;
    }
    public void setVideojuegos(Videojuego[] videojuegos) {
        this.videojuegos = videojuegos;
    }

    //setter
    
    

    
}
