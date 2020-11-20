import java.util.Scanner;
    public class Ejercicio6 {

	public static void main(String[] args) {		
        Scanner teclado = new Scanner (System.in);

        double Nota1, Nota2, Nota3;

        System.out.println("Introduzca la nota del primer examen");
        Nota1= teclado.nextDouble();
        System.out.println("Introduzca la nota que quisiera sacar");
        Nota2= teclado.nextDouble();

        Nota3 = ((Nota2 * 100) - (Nota1 * 40))/60;

        System.out.println("Para obtener un: " + Nota2 + " debería sacar un: " + Nota3);


    }
}
