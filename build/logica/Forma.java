package logica;
public class Forma{
    public int calcularArea(int lado){
        return lado*lado;
    }
    public double calcularArea(int base, int altura){
        return base*altura/2;
    }
    public double calcularArea(int radio, String figura){
        if (figura.equalsIgnoreCase("circulo"))
            return Math.PI*Math.pow(radio, 2);
        else
            return 0;

    }
}