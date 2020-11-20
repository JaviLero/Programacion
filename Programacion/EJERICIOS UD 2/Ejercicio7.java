import java.util.Scanner;
    public class Ejercicio7 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);		

        double x;
        double y;
        double z;

        System.out.println("Introduzca el valor de x");
        x= teclado.nextDouble();
        System.out.println("Introduzca el valor de y");
        y= teclado.nextDouble();

        z=(1+((x*x)/y))/((x*x*x)/1+y);

        System.out.println("Siendo x= " + x + " e y= " + y +" El resultado de la operación es z= " + z );

    }
}
