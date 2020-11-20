import java.util.Scanner;
    public class Ejercicio5 {

	public static void main(String[] args) {		
        Scanner teclado = new Scanner (System.in);

        double valorEuro = 166.386;
        double cantidad, resultadoPeseta;

        System.out.println("Introduca el número de Euros");
        cantidad = teclado.nextDouble();

        resultadoPeseta = cantidad * valorEuro;

        System.out.println("El valor en Euros es: " + resultadoPeseta + " pesetas.");


    }
}
