package miPrincipal;
import logica.Forma;
public class AppForma{
    public static void menu(){
        System.out.println("**********************");
        System.out.println(" SOBRECARGA DE MÉTODOS");
        System.out.println("**********************");
        Forma forma = new Forma();
        double area;
        area = forma.calcularArea(5);
        System.out.println("Area de cuadrado = "+area);
        area = forma.calcularArea(5,8);
        System.out.println("Area de triángulo = "+area);
        area = forma.calcularArea(5,"circulo");
        System.out.println("Area de circulo = "+area);
        area = forma.calcularArea(5,"cuadrado");
        System.out.println("Area de circulo = "+area);



    }
}