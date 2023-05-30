package Practica;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el valor de N: ");
            int n = scanner.nextInt();

            int first = 1;
            int second = 1;

            System.out.print("Serie Fibonacci de " + n + " números: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;
            }

        }
    }