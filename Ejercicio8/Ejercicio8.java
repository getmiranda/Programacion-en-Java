import java.util.*;
public class Ejercicio8{
    public static void main(String[] args) {
        Scanner nada =new Scanner(System.in);
        double base;
        double altura;
        base = nada.nextInt();
        altura = nada.nextInt();
        double area = (base*altura)/2;
        double perimetro = (base * 3);
        System.out.println("el area es " + area );
        System.out.println("el perimetro es " + perimetro);      
        }
}