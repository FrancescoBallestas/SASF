package Practica;

import java.util.Scanner;

public class ImprimirTablaMultiplicar {
    public static void imprimirTablaMultiplicar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número que desea verificar: ");

        int numero = scanner.nextInt();
        System.out.println("Tabla de Multiplicar del " + numero + ": ");
        for(int i = 1; i <= 12; i++){
            int resultado = numero * i;
            System.out.println(numero + "*" + i + " = " + resultado);
        }
    }
}
