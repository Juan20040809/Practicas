import java.util.Scanner;

    public class Ecuacioncuadratica {
        public static void main(String[] args) {
            System.out.println("Programa para calcular una ecuacion cuadratica usando la formula general");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el valor de a: ");
            Double a = teclado.nextDouble();
            System.out.println("Ingrese el valor de b: ");
            Double b = teclado.nextDouble();
            System.out.println("Ingrese el valor de c: ");
            Double c = teclado.nextDouble();


            Double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
            System.out.println("El valor x1 es:" + x1);

            Double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
            System.out.printf("El valor de x2 es:" + x2);

        }

    }