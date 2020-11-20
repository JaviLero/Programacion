public class Ejercicio3 {
	public static void main(String[] args) {	
        
    int a=8 ,b=3;
    double res;
    res = (double) a / b;

        
        System.out.printf("La división es: %.16f%n", res);
        System.out.printf("La división es: %.2f%n", res);
        System.out.printf("La división es: %5.2f%n", res);
        System.out.printf("La división es: %7.3f %n", res);
        System.out.printf("La división es: %07.3f %n", res);
        System.out.printf("La división es: %10.4f %n", res);
        System.out.printf("La división es: %5.3f %n", res);
        System.out.printf("La división es: %10.5f %n", res);
        System.out.printf("La división es: %010.0f %n", res);
    }
}
