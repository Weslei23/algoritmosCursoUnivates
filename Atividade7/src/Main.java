
//3. Solicitar ao usuário o seu nome e salário. Com base no salário informado, mostre a mensagem correspondente:
//      - Salário menor do que R$1000: Você ganha pouco.
//      - Salário menor do que R$2000 e maior do que R$1000: Você ganha um pouco mais.
//      - Salário maior do que R$2000: Você ganha mais que um salário mínimo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        double salario;
        System.out.println("Digite o seu salário: ");
        salario = scanner.nextDouble();

        if (salario <= 1000){
            System.out.println("Nome: " + nome);
            System.out.println("Você ganha pouco!");
        }else if (salario < 2000 && salario > 1000){
            System.out.println("Nome: " + nome);
            System.out.println("Você ganha um pouco mais");
        }else if (salario >= 2000) {
            System.out.println("Nome: " + nome);
            System.out.println("Você ganha mais que um salário mínimo");
        }
    }
}