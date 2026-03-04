package miPrincipal;
import java.util.Scanner;

public class Principal {
   

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int opc = 0;
      do{
         System.out.println("*******************");
         System.out.println("   MENU PRINCIPAL  ");
         System.out.println("*******************");
         System.out.println("1) Alumno");
         System.out.println("2) Punto");
         System.out.println("3) Racional");
         System.out.println("4) Fecha");
         System.out.println("5) Forma");
         System.out.println("6) Relacion de Composición");
         System.out.println("7) Relación de Agregación");


         System.out.println("\t 0) Salir");
         System.out.print("Seleccione opción:");
         opc = teclado.nextInt();
         switch (opc){
            case 1:
               AppAlumno.menu();
               break;
            case 2:
               AppPunto.menu();
               break;
            case 3:
               AppRacional.menu();
               break;
            case 4:
               AppFecha.menu();
               break;
            case 5:
               AppForma.menu();
               break;
            case 6:
               AppAutomovil.menu();
               break;
            case 7:
               AppComputadora.menu();
               break;

            case 0:
               System.out.println("Hasta Luego!");
               teclado.close();
               break;
            default:
               System.out.println("opción incorrecta, intente de nuevo!");
         }

      }while (opc != 0);
      

    }
}