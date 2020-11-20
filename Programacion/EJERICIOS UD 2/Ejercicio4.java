import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {		
        Scanner teclado = new Scanner (System.in);

        double a, b, c;

        System.out.println("Introduca el número de niños de la clase");
        a= teclado.nextInt();
        System.out.println("Introduca el número de niñas de la clase");
        b= teclado.nextInt();

        c = a+b;
        a = a/c*100;
        b = b/c*100;

        System.out.println("El porcentaje de niños es: " + a);
        System.out.println("El porcentaje de niñas es: " + b);
    }
}
