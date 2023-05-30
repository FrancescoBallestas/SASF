package Practica;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("MENÚ ");
        System.out.println("1. Verificar Número Perfecto ");
        System.out.println("2. Imprimir Tabla de Multiplicar");
        System.out.println("3. Verificar Factorial ");
        System.out.println("4. Número Invertido ");
        System.out.println("5. Salir ");
        System.out.println("Digite la opción que desea ingresar: ");

        int seleccion = scanner.nextInt();

        switch (seleccion){
            case 1:
                VerificarNumeroPerfecto.verificarNumeroPerfecto();
                break;
            case 2:
                ImprimirTablaMultiplicar.imprimirTablaMultiplicar();
                break;
            case 3:
                VerificarFactorial.verificarFactorial();
                break;
            case 4:
                NumeroInvertido.numeroInvertido();
                break;
            case 5:
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }
    }
}
