import java.util.Scanner;

public class diasemana {
    public static void main(String[] args) {
        System.out.println("Programa para saber los dias de la semana");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = teclado.nextInt();
if ( dia == 1 )
    System.out.printf("Lunes");
        else if ( dia == 2 )
            System.out.printf("Martes");
        else if ( dia == 3 )
            System.out.printf("Miercoles");
         else if ( dia == 4 )
            System.out.printf("Jueves");
        else if ( dia == 5 )
            System.out.printf("Viernes");
        else if ( dia == 6 )
            System.out.printf("Sabado");
        else if ( dia == 7 )
            System.out.printf("Domingo");

    else

        System.out.println("El valor esta incorrecto");










    }



}

