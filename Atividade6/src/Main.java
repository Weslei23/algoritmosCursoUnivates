//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Nome: " + nome);
            System.out.println("Você está liberado para fazer a carteira de motorista!");
        }else{
            System.out.println("Nome: " + nome);
            System.out.println("Você ainda é muito novo para tirar carteira de motorista");
        }
    }
}