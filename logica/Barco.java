package logica;

public class Barco extends Vehiculo {
    private String tipo;

    public Barco() {
    }

    public Barco(int id, String titulo) {
        super(id, titulo);
    }

    public Barco(String tipo) {
        this.tipo = tipo;
    }

    public Barco(int id, String titulo, String tipo) {
        super(id, titulo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Barco [tipo=" + tipo + "]";
    }
    
    
    

    
}

