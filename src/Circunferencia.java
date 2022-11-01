import java.util.Scanner;
public class Circunferencia {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el área de un triángulo");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        Double radio = teclado.nextDouble();
        Double area = Math.pow(radio, 2) * Math.PI;
        System.out.println("El área del círculo es: " + area);
    }
}



