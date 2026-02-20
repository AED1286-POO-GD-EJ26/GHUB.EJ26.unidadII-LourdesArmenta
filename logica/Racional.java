package logica;
public class Racional{
    private int num;
    private int den;
    //Método constructor
    //vacio
    public Racional(){
        num = 0;
        den = 0;

    }
    //lleno
    public Racional(int num, int den){
        this.num = num;
        this.den = den;

    }

    public void fijarNum(int num){
        this.num = num;
    }
    public int leerNum(){
        return this.num;
    }

    public void fijarDen(int den){
        this.den = den;
    }
    public int leerDen(){
        return this.den;
    }
    
    public Racional sumar( Racional r){
        Racional nuevo = new Racional();
        nuevo.fijarNum(this.num*r.leerDen()+this.den*r.leerNum());
        nuevo.fijarDen(this.den*r.leerDen());
        return nuevo;
    }
     public Racional restar( Racional r){
        Racional nuevo = new Racional();
        nuevo.fijarNum(this.num*r.leerDen() - this.den*r.leerNum());
        nuevo.fijarDen(this.den*r.leerDen());

        return nuevo;
    }
     public Racional mult( Racional r){
        Racional nuevo = new Racional();
        nuevo.fijarNum(this.num*r.leerNum());
        nuevo.fijarDen(this.den*r.leerDen());

        return nuevo;
    }
     public Racional div( Racional r){
        Racional nuevo = new Racional();
        nuevo.fijarNum(this.num*r.leerDen());
        nuevo.fijarDen(this.den* r.leerNum());
        return nuevo;
    }

    public String obtenerDetalles(){
        return this.num+"/"+this.den;
    }
}