package miPrincipal;
import logica.Racional;
public class AppRacional{
    public static void menu(){
        System.out.println("******************");
        System.out.println("   CLASE RACIONAL ");
        System.out.println("******************");
        //Crear objetos
        //Forma 1. de un solo paso
        Racional r1 = new Racional();
        Racional r2 = new Racional(2,3);
        //Forma 2. en dos pasos
        Racional r3; //declaro a r3 como tipo Racional;
        r3 = new Racional() ; //instancia un nuevo onjeto tipo Racional

        System.out.println("Valor de racional 1="+r1.obtenerDetalles());
        System.out.println("Valor de racional 2="+r2.obtenerDetalles());
        System.out.println("Valor de racional 3="+r3.obtenerDetalles());

        r1.fijarNum(4);
        r1.fijarDen(5);

        System.out.println("Valor de racional 1="+r1.obtenerDetalles());
        System.out.println("Valor de racional 2="+r2.obtenerDetalles());

        Racional nuevo = r2.sumar(r1);

        System.out.println(r2.obtenerDetalles()+" + "
           +r1.obtenerDetalles()+" = "+nuevo.obtenerDetalles());

        r1.fijarNum(2);
        r1.fijarDen(3);

        r2.fijarNum(1);
        r2.fijarDen(5);

        System.out.print(r1.obtenerDetalles()+" + "
           +r2.obtenerDetalles()+" = ");
        
        nuevo = r1.sumar(r2);
        System.out.println(nuevo.obtenerDetalles());

        System.out.print(r1.obtenerDetalles()+" - "
           +r2.obtenerDetalles()+" = ");
        
        nuevo = r1.restar(r2);
        System.out.println(nuevo.obtenerDetalles());

        System.out.print(r1.obtenerDetalles()+" * "
           +r2.obtenerDetalles()+" = ");
        
        nuevo = r1.mult(r2);
        System.out.println(nuevo.obtenerDetalles());

        System.out.print(r1.obtenerDetalles()+" / "
           +r2.obtenerDetalles()+" = ");

        nuevo = r1.div(r2);
        System.out.println(nuevo.obtenerDetalles());

    }
}