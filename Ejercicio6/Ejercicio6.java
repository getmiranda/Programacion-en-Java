//Ejercicio6.java Lea la longitud de unos de los lados 
//de un cuadrado. Calcule el área, perímetro e imprima el resultado.
import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[]variable){
        Scanner normal=new Scanner(System.in);
        double l;
        double m;
        double n;
        System.out.print("introduzca longitud: ");
        l=normal.nextDouble();
        System.out.print("el area del cuadrado es: ");
        m= l*l;
        System.out.println(m);
        System.out.print("el resulado del perimetro es: ");
    
        n= l+l+l+l;
        System.out.print(n);

    }
}