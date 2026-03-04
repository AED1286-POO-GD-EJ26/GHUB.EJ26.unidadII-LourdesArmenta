package logica;

public class Computadora {
    //Atributos
    private String marca;
    private String modelo;
    private Monitor monitor;
    public Computadora(){

    }
    public Computadora(String marca, String modelo, Monitor monitor){
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
    }
    //getter y setter
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    @Override
    public String toString() {
        return "Computadora [marca=" + marca + ", modelo=" + modelo + ", monitor=" + monitor + "]";
    }
    

    
    
}
