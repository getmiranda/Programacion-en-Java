/**Lea los 4 lados de un trapecio, así como su altura. Calcule el área, perímetro
e imprima el resultado. */
import java.util.*;
public class Ejercicio9{
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
       
        double altura,baseMayor,baseMenor,lado1,lado2;  //Declaro variebles
        double area, perimetro;

        System.out.print("Ingrese el valor de la base Mayor de su trapecio: "); //Pido los valores de las variebles
        baseMayor = entrada.nextDouble();   

        System.out.print("Ingrese el valor de la base Menor de su trapecio: ");
        baseMenor = entrada.nextDouble();

        System.out.print("Ingrese el valor del lado A de su trapecio: ");
        lado1 = entrada.nextDouble();

        System.out.print("Ingrese el valor del lado B de su trapecio: ");
        lado2 = entrada.nextDouble();

        System.out.print("Ingrese el valor de la altura  de su trapecio: ");
        altura = entrada.nextDouble();

        perimetro = baseMayor+baseMenor+lado1+lado2;        //Operaciones
        area = ((baseMayor+baseMenor)/2)*altura;

        System.out.println("El area es: "+area+"\nElperimeto es: "+perimetro);  //Imprimo los resultados


    }
}