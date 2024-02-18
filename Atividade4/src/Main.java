//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double valorUnitario, quantidade;

        System.out.println("Digite o nome do produto 1: ");
        nome = scanner.next();
        System.out.println("Digite o valor unitário do produto 1: ");
        valorUnitario = scanner.nextDouble();
        System.out.println("Digite a quantidade comprada do produto 1: ");
        quantidade = scanner.nextDouble();
        double subtotal1 = valorUnitario * quantidade;

        String nome2;
        System.out.println("Digite o nome do produto 2: ");
        nome2 = scanner.next();
        System.out.println("Digite o valor unitário do produto 2: ");
        valorUnitario = scanner.nextDouble();
        System.out.println("Digite a quantidade comprada do produto 2: ");
        quantidade = scanner.nextDouble();
        double subtotal2 = valorUnitario * quantidade;

        String nome3;
        System.out.println("Digite o nome do produto 3: ");
        nome3 = scanner.next();
        System.out.println("Digite o valor unitário do produto 3: ");
        valorUnitario = scanner.nextDouble();
        System.out.println("Digite a quantidade comprada do produto 3: ");
        quantidade = scanner.nextDouble();
        double subtotal3 = valorUnitario * quantidade;

        String nome4;
        System.out.println("Digite o nome do produto 4: ");
        nome4 = scanner.next();
        System.out.println("Digite o valor unitário do produto 4: ");
        valorUnitario = scanner.nextDouble();
        System.out.println("Digite a quantidade comprada do produto 4: ");
        quantidade = scanner.nextDouble();
        double subtotal4 = valorUnitario * quantidade;

        String nome5;
        System.out.println("Digite o nome do produto 5: ");
        nome5 = scanner.next();
        System.out.println("Digite o valor unitário do produto 5: ");
        valorUnitario = scanner.nextDouble();
        System.out.println("Digite a quantidade comprada do produto 5: ");
        quantidade = scanner.nextDouble();
        double subtotal5 = valorUnitario * quantidade;

        double total = subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5;

        System.out.println("O resultado da soma de todas as compras é de" + "R$" + total);
    }
}