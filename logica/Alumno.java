package logica;
public class Alumno{
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    //Métodos
    //constructores
    public Alumno(){

    }
    public Alumno(int id_, String nombre_,String apellido_){
        id = id_;
        nombre = nombre_;
        apellido = apellido_;

    }
    public void saludar(){
        System.out.println("Hola, soy "+nombre+ " "+apellido+"  y se saludar");
    }

    public void fijarId(int id_){
        id = id_;
    }
    public int leerId(){
        return id;
    }

    public void fijarNombre(String nombre_){
        nombre = nombre_;

    }
    public String leerNombre(){
        return nombre;
    }

    public void fijarApellido(String apellido_){
        apellido = apellido_;
    }
    public String leerApellido(){
        return apellido;
    }

    public String obtenerDetalle(){
        return id+" "+nombre+" "+apellido;
    }



}