package miPrincipal;
import logica.Fecha;
public class AppFecha {
    public static void menu(){
        System.out.println("******************");
        System.out.println("    CLASE FECHA   ");
        System.out.println("******************");
        Fecha f1;
        f1 = new Fecha();
        f1.setDia(11);
        f1.setMes(2);
        f1.setAnio(1968);


        System.out.println("Dia de Fecha 1:"+f1.getDia());
        System.out.println("Mes de Fecha 1:"+f1.getMes());
        System.out.println("Año de Fecha 1:"+f1.getAnio());
        System.out.println("Fecha:"+f1);
        Fecha f2 = new Fecha();
        f2.setDia(11);
        f2.setMes(2);
        f2.setAnio(1968);

        //String s1 = "Lourdes";
        //String s2 = "Lourdes";

        //System.out.println(s1.equals(s2));
        if (f1.equals(f2)){
            System.out.println("Fechas iguales");
        }else{
            System.out.println("Fecha diferentes");
        }

        Fecha f3 = new Fecha();
        f3.setDia(11);
        f3.setMes(2);
        f3.setAnio(1967);

        if (f2.equals(f3)){
            System.out.println("Fechas iguales");
        }else{
            System.out.println("Fecha diferentes");
        }

        Fecha f4;
        f4 = new Fecha(10,11,2026);
        System.out.println("Fecha "+f4);

        Fecha f5 = new Fecha(31,12,2025);
        f5.setAnio(2026);
        System.out.println("Fecha: "+f5);




    }

}
