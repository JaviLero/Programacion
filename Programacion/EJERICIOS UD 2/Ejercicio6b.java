import java.util.Scanner;
    public class Ejercicio6b {

	public static void main(String[] args) {		
        Scanner teclado = new Scanner (System.in);

        double NotaPrimerExamen, NotaFinal, NotaSegundoExamen;

        System.out.println("Introduzca la nota del primer examen");
        NotaPrimerExamen= teclado.nextDouble();
        System.out.println("Introduzca la nota que quisiera sacar");
        NotaFinal= teclado.nextDouble();

        NotaSegundoExamen = ((NotaFinal * 100) - (NotaPrimerExamen * 40))/60;

        if(NotaSegundoExamen > 10 || NotaSegundoExamen < 0){
        System.out.println("Nota erronea " );
        }else{
        System.out.println("Para obtener un: " + NotaFinal + " debería sacar un: " + NotaSegundoExamen);
    }
    }
}
