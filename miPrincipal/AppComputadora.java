package miPrincipal;
import logica.Computadora;
import logica.Monitor;

public class AppComputadora {
    public static void menu(){
        System.out.println("**************************");
        System.out.println("   RELACION DE AGREGACIÓN ");
        System.out.println("**************************");
        
        Computadora compu1 = new Computadora("HP","ML500",
                                new Monitor("HP",15));

        System.out.println("Computadora 1:"+compu1);

        Computadora compu2 = new Computadora();
        compu2.setMarca("Apple");
        compu2.setModelo("air");

        Monitor monitor = new Monitor();
        monitor.setMarca("Sin marca");
        monitor.setTamanio(20);

        compu2.setMonitor(monitor);

        System.out.println("Computadora 2: "+compu2);


        
    }
    
}
