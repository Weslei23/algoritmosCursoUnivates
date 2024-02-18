// Solicitar dois números positivos, realizar a subtração de um pelo outro e mostrar o resultado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, resultado;

        System.out.println("Digite um número A: ");
        n1 = scanner.nextInt();
        System.out.println("Digite outro número B: ");
        n2 = scanner.nextInt();

        resultado = n1 - n2;
        System.out.println("A subtração entre A e B é igual a: " + resultado);
    }
}