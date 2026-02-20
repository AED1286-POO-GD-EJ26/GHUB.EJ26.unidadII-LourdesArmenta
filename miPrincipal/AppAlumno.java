package miPrincipal;
import logica.Alumno;
public class AppAlumno{
    public static void menu(){
        System.out.println("******************");
        System.out.println("   CLASE ALUMNO   ");
        System.out.println("******************");
        Alumno alu1 = new Alumno(567,"Luz","López");
        Alumno alu2 = new Alumno(601,"Juan","Perez");
        Alumno alu3 = new Alumno();

        alu1.saludar();
        alu2.saludar();
        alu3.saludar();

        alu3.fijarId(792);
        alu3.fijarNombre("Lucia");
        alu3.fijarApellido("Mendez");

        alu2.fijarNombre("Juana");

        alu1.saludar();
        alu2.saludar();
        alu3.saludar();

        System.out.println(alu1.obtenerDetalle());
        System.out.println(alu2.obtenerDetalle());
        System.out.println(alu3.obtenerDetalle());

        System.out.println(alu1.leerId());
        System.out.println(alu1.leerNombre());
        System.out.println(alu1.leerApellido());
    }

}