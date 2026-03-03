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
    //sobrecargo el constructor
    public Fecha(String f){
        //buscamos la primera ocurrencia de '/'
        int pos1 = f.indexOf('/');
        //buscamis la segunda ocurrencia de '/'
        int pos2 = f.lastIndexOf('/');
        //procesamos el dia
        String sDia = f.substring(0,pos1);
        this.dia = Integer.parseInt(sDia);
        //procesamos el mes
        String sMes = f.substring(pos1+1,pos2);
        this.mes = Integer.parseInt(sMes);
        //procesamos el Año
        String sAnio = f.substring(pos2+1);
        this.anio = Integer.parseInt(sAnio);

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

    //retorna la fecha expresada en dias
    private int fechatoDias(){
        return this.anio*360+this.mes*30+this.dia;
    }
    //asigna la fecha en dias a los Atributos
    private void diasToFecha(int i){
        //dividimos por 360 y obtenemos el año
        this.anio = (int) i/360;

        //del resto o residuo de la division anterior
        //podemos obtener el mes y el dia
        int resto = i % 360;
         
        //el mes el el resto dividido entre 30
        this.mes =  (int) resto/30;

        //el resto de la dividion anterios son los dias
        this.dia = resto % 30;

        //ajustamos por si el dia quedo en cero
        if (dia ==0){
            dia = 30;
            mes--;
        }
        //ajustamos por si el mes quedo en cero
        if(mes == 0){
            mes = 12;
            anio--;
        }


    }
    public void addDias(int d){
        //convertimos la fecha a dias y le sumamos d
        int sum = fechatoDias()+d;
        //la fecha resultante (sum) se separa en dia,mes y anio
        this.diasToFecha(sum);
    }

    
   
   
    
    

    

}
