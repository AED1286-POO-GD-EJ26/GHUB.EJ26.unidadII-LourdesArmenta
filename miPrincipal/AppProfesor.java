package miPrincipal;
import logica.Estudiante;
import logica.Profesor;
public class AppProfesor{
    public static void menu(){
        System.out.println("*****************************");
        System.out.println("   RELACIÓN DE ASOCIACIÓN    ");
        System.out.println("*****************************");
        
        Estudiante est1 = new Estudiante();
        est1.setNombre("Juan Pérez");

        Estudiante est2= new Estudiante("Julia López");

        Profesor prof1 = new Profesor();
        prof1.setNombre("Gilberto García");

        Profesor prof2 = new Profesor("Dario Payan");

        prof1.ensenar(est1);

        prof2.ensenar(est2);
    }
}