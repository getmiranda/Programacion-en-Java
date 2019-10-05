public class EInventado1{
    public static void main(String[] args) {
        //Declaramos variables a utilizar
        double x = 1.0;
        double y = 2.0;
        double res = 0.0;

        //Expresion
        res = ( (x + y) * (x + y) ) + ( (y * y * y) / (x) );

        //Imprime
        System.out.println(res);
    }
}