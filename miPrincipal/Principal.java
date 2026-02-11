package miPrincipal;

public class Principal {
   

    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        //Crear tres Objetos de la clase Punto

        Punto p1 = new Punto(); //invocando al constructor vacio
        Punto p2 = new Punto(1,1);
        Punto p3 = new Punto(4,5);

        p1.fijarX(3);
        p1.fijarY(4);

        System.out.print("x = "+p1.LeerX()+"  ");
        System.out.println("y = "+p1.LeerY());

        System.out.print("x = "+p2.LeerX()+"  ");
        System.out.println("y = "+p2.LeerY());

        p3.fijarY(4);

        System.out.print("x = "+p3.LeerX()+"  ");
        System.out.println("y = "+p3.LeerY());


    }
}