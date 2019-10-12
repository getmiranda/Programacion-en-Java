public class EInventado6{
    public static void main (String[]numero){
        int edad = 15;
        if (edad >= 18 && edad <= 30){
        System.out.println("joven");
        }else if (edad > 30 && edad <= 59){
            System.out.println("adulto");
        }else if (edad >= 60 ){
            System.out.println("adulto mayor");
        }else {
            System.out.println("error systaxis");
        }

    }
}
