
import java.util.Scanner;
public class Ejercicio7{

public static void main(String[]variable){
    //Ejercicio7.java Lea el ancho y alto de un rectángulo. 
    //Calcule el área, perímetro e imprima el
//resultado.
Scanner datos=new Scanner (System.in);
double alto;
double ancho;
double area;
double perimetro;
System.out.print("pon aqui tu altura: ");
alto = datos.nextDouble(); 
System.out.print("ahora pon aqui tu anchura: ");
ancho = datos.nextDouble();

area = alto * ancho; 
perimetro = alto + alto + ancho + ancho;
System.out.println("los resultados son estos: ");

System.out.println(area);
System.out.println(perimetro);

}}
