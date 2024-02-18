//Solicitar nome, endereço e idade para um usuário e mostrar as informações digitadas no console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, endereco;
        int idade;

        System.out.println("Digite o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite o seu endereço: ");
        endereco = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        idade = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);

    }
}