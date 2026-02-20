package soporte;
class Marco {
    //Atributos o campos de la clase
    private double p;
    String t;
    //Método constructor
    public Marco(){


    }
    public void poner(){
        Foto u = new Foto("Paloma");
        u.mtd();
        t = "**"+u.q+"***"; // el campo q de la clase Foto
                            // es visible desde la clase Marco, porque nombre   
                            // no es privada

    }

}