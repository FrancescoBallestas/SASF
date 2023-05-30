package Practica;

import java.util.Scanner;

public class NumeroInvertido {
    public static void numeroInvertido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea invertir: ");

        String numeroInvertido = String.valueOf(scanner.nextInt());
        int num = Integer.parseInt(new StringBuilder(numeroInvertido).reverse().toString());
        
        System.out.println("El número invertido es: " + num);
    }
}
