package Practica;
import java.util.Scanner;

public class NumerosTerminadosEn2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contadorNumerosTerminadosEn2 = 0;

        System.out.println("Ingrese una serie de números (ingrese un número negativo para finalizar): ");

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero % 10 == 2) {
                contadorNumerosTerminadosEn2++;
            }
        }
        System.out.println("Se han leído " + contadorNumerosTerminadosEn2 + " número(s) terminados en 2.");
    }
}
