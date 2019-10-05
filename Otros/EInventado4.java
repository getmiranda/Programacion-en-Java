import java.util.Scanner;
public class EInventado4{
    public static void main(String[]variable){
        Scanner nombre=new Scanner(System.in);
        int aczino;
        int wos;
        int mks;

        System.out.print("Ingresa el primer valor: ");
        aczino=nombre.nextInt();

        System.out.print("Ingresa el segundo valor: ");
        wos=nombre.nextInt();

        mks = aczino + wos;

        System.out.print("El resultado es: ");
        System.out.println(mks);
    
    }
}