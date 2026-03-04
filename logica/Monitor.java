package logica;

public class Monitor {
    private String marca;
    private int tamanio;
    public Monitor() {
    }
    public Monitor(String marca, int tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    @Override
    public String toString() {
        return "Monitor [marca=" + marca + ", tamanio=" + tamanio + "]";
    }
    
    
    
}
