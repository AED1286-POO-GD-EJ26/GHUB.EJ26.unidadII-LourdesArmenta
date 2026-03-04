package miPrincipal;
import logica.Automovil;
import logica.Motor;

public class AppAutomovil {
    public static void menu(){
        System.out.println("***********************");
        System.out.println("Relación de Composición");
        System.out.println("***********************");
        Automovil auto1 = new Automovil();
        auto1.setMarca("Honda");
        auto1.setModelo("CRV");

        Motor motor1 = new Motor("gasolina",200);

        auto1.setMotor(motor1);

        System.out.println("Automovil 1: "+auto1);

        Automovil auto2 = new Automovil("BYD","turner",
                    "electrico",480);

        System.out.println("Automovil 2 = "+auto2);



    

    }
    
}
