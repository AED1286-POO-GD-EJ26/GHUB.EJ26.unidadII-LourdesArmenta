package soporte2;

class Marco{
    private double p;
    String t;
    public Marco(){
        soporte.Foto u = new soporte.Foto("Paloma");
        u.mtd();
        //t = "***"+u.q+"***"; // q no puede ser accesible porque no tiene
                              //identificador de acceso y por lo tanto 
                              //no es vista por una clase fuera del paquete
    }
}