package miPrincipal;
import logica.Alumno;

public class Principal {
   

    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        //Crear tres Objetos de la clase Punto

        Punto p1 = new Punto(); //invocando al constructor vacio
        Punto p2 = new Punto(1,1);
        Punto p3 = new Punto(4,5);

        p1.fijarX(3);
        p1.fijarY(4);

        System.out.println("Prueba de la clase Punto:");

        System.out.print("x = "+p1.LeerX()+"  ");
        System.out.println("y = "+p1.LeerY());

        System.out.print("x = "+p2.LeerX()+"  ");
        System.out.println("y = "+p2.LeerY());

        p3.fijarY(4);

        System.out.print("x = "+p3.LeerX()+"  ");
        System.out.println("y = "+p3.LeerY());

        System.out.println(p1.obtenerDetalles());
        System.out.println(p2.obtenerDetalles());
        System.out.println(p3.obtenerDetalles());

        System.out.println("Prueba de la clase Alumno:");

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