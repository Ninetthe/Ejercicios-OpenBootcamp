public class Main {

    public static void main(String[] args) {
        //Primera parte:Crear una función con tres parámetros que sean números que se suman entre sí.
        //Llamar a la función en el main y darle valores.

        int resultado = 0;
        resultado = suma(15, 20, 30);
        System.out.println(resultado);

    }
    public static int suma(int a, int b, int c) {
        return a+b+c;


    }
}