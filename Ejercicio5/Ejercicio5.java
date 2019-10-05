import java.util.Scanner;
//Ejercicio5.java Lea 3 números double, multiplíquelos e imprima el resultado
public class Ejercicio5{
    public static void main(String[]variable){
        Scanner papo = new Scanner (System.in);
        double num1; double num2; double num3; double num4;
        
        System.out.print("Ingresa el primer numero: ");
        num1 = papo.nextDouble();

        System.out.print ("Ingresa el segundo numero: ");
        num2 = papo.nextDouble();

        System.out.print ("Ingresa el tercer numero: ");
        num3 = papo.nextDouble();

        num4=(num1)*(num2)*(num3);
        System.out.print(num4);

    }
}