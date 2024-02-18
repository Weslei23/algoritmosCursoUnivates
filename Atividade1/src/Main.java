
// Criar um programa que some dois números.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, resultado;

        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        n2 = scanner.nextInt();

        resultado = n1 + n2;

        System.out.println("A soma dos dois números é igual a: " + resultado);
    }
}