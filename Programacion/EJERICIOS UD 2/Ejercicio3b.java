public class Ejercicio3b {
	public static void main(String[] args) {		
        
        String linea;
        System.out.print("Introduzca un número: ");
        linea = System.console().readLine();
        double x = Double.parseDouble(linea);
        System.out.print("Introduzca otro número: ");
        linea = System.console().readLine();
        double y = Double.parseDouble(linea);
        System.out.println("x=" + x + " y="+ y);
        System.out.println("x+y=" +(x+y));
        System.out.println("x-y=" +(x-y));
        System.out.println("x*y=" +(x*y));
        System.out.println("x/y=" +(x/y));

    }
}
