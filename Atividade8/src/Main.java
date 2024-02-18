//1. Solicitar nome, valor unitário e quantidade comprada de 20 produtos. Ao
//final, mostrar o total de todas as compras;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {

            String nome;
            double quantidade, valor;

            System.out.println("Digite o nome do produto 1: ");
            nome = scanner.next();
            System.out.println("Digite o valor unitário do produto 1: ");
            valor = scanner.nextDouble();
            System.out.println("Digite a quantidade comprada do produto 1: ");
            quantidade = scanner.nextDouble();
            double total = valor * quantidade;

            System.out.println("Digite o nome do produto 2: ");
            nome = scanner.next();
            System.out.println("Digite o valor unitário do produto 2: ");
            valor = scanner.nextDouble();
            System.out.println("Digite a quantidade comprada do produto 2: ");
            quantidade = scanner.nextDouble();
            double total2 = valor * quantidade;

            System.out.println("Digite o nome do produto 3: ");
            nome = scanner.next();
            System.out.println("Digite o valor unitário do produto 3: ");
            valor = scanner.nextDouble();
            System.out.println("Digite a quantidade comprada do produto 3: ");
            quantidade = scanner.nextDouble();
            double total3 = valor * quantidade;

            System.out.println("Digite o nome do produto 4: ");
            nome = scanner.next();
            System.out.println("Digite o valor unitário do produto 4: ");
            valor = scanner.nextDouble();
            System.out.println("Digite a quantidade comprada do produto 4: ");
            quantidade = scanner.nextDouble();
            double total4 = valor * quantidade;

            System.out.println("Digite o nome do produto 5: ");
            nome = scanner.next();
            System.out.println("Digite o valor unitário do produto 5: ");
            valor = scanner.nextDouble();
            System.out.println("Digite a quantidade comprada do produto 5: ");
            quantidade = scanner.nextDouble();
            double total5 = valor * quantidade;

            double resultado = total + total2 + total3 + total4 + total5;
            System.out.println("O total das compras foi de: " + resultado);

            break;
        }
    }
}