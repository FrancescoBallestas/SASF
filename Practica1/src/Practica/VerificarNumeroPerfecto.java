package Practica;

import java.util.Scanner;

public class VerificarNumeroPerfecto {
    public static void verificarNumeroPerfecto(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea verificar: ");

        int sumaDivisores = 0, numeroPerfecto = scanner.nextInt();

        if (numeroPerfecto > 0){
            for (int i = 1; i <= numeroPerfecto / 2; i++) {
                if (numeroPerfecto % i == 0) {
                    sumaDivisores += i;
                }
            }
            if (sumaDivisores == numeroPerfecto){
                System.out.println("El número es perfecto");
            } else {
                System.out.println("El número es imperfecto");
            }
        }else {
            System.out.println("El numero no puede ser negativo");
        }
    }
}
