package Practica;

import java.util.Scanner;

public class VerificarFactorial {
    public static void verificarFactorial() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea verificar: ");

        int numeroFactorial = scanner.nextInt(), factorial = 1, i=1;

        while(i<=numeroFactorial) {
            factorial *= i;
            i++;
        }
        System.out.print("El resultado de " + numeroFactorial + "! es: " + factorial);
    }
}
