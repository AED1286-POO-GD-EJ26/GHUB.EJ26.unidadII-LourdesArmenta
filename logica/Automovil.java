package logica;

public class Automovil {
    //atributos
    private String marca;
    private String modelo;
    private Motor motor;
    public Automovil() {
    }
    public Automovil(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    public Automovil(String marca, String modelo, 
               String tipoMotor, int potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor,potencia);

    }
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
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    @Override
    public String toString() {
        return "Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + "]";
    }
    
    
    
    
}
