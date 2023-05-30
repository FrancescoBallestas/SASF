package Practica;

import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea validar: ");

        int sumaDivisores = 0;
        int numeroPerfecto = scanner.nextInt();

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
