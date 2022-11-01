import java.util.Scanner;

public class Hipotenusa {
        public static void main(String[] args) {
            System.out.println("Programa para calcular la hipotenusa");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el valor del cateto_Opuesto: ");
            double cateto_Opuesto = teclado.nextInt();
            System.out.println("Ingrese el valor del cateto_Adyacente: ");
            double cateto_Adyacente = teclado.nextInt();
            double Hipotenusa = Math.sqrt(Math.pow(cateto_Opuesto, 2) + Math.pow(cateto_Adyacente, 2));
            System.out.println("El valor de la hipotenusa es:"+ Hipotenusa);


        }

}
