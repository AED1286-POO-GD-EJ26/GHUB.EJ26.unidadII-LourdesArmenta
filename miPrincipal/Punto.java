package miPrincipal;
public class Punto {
    //Atributos
    private int x; //coordenada x
    private int y; //coordenada y
    //Métodos constructores
    public Punto(){
        x = 0;
        y = 0;

    }
    public Punto(int x_, int y_){
        x = x_;
        y = y_;
    }

    public void fijarX(int valorX){
        x = valorX;
    }
    public void fijarY(int valorY){
        y = valorY;
    }
    public int LeerX(){
        return x;
    }
    public int LeerY(){
        return y;
    }

    public String obtenerDetalles(){
        return " x = "+x+" y = "+y;
    }
    

}
