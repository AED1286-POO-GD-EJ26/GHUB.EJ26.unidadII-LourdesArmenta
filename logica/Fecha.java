package logica;
 public class Fecha {
    //Atributos
    private int dia;
    private int mes;
    private int anio;

    //Métodos constructores
    //vacio
    public Fecha(){
        this.dia =1;
        this.mes=1;
        this.anio =2000;

    }
    //lleno
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + anio;
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean resultado;
        Fecha otra = (Fecha) obj;
        resultado = (this.dia == otra.getDia()) && 
                    (this.mes == otra.getMes())&& (this.anio == otra.getAnio());
        return resultado;  
    }
    
   
   
    
    

    

}
