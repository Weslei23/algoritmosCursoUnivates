// Solicitar ao usuário seu nome e sua cidade.
// Caso a cidade informada for Lajeado, informar a seguinte mensagem: Você mora em lajeado!
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, cidade;

        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        System.out.println("Digite sua cidade: ");
        cidade = scanner.next();

        if (cidade.equals("Lajeado")) {
            System.out.println("Nome: " + nome);
            System.out.println("Você mora em Lajeado!");
        }else{
            System.out.println("Nome: " + nome);
            System.out.println("Você não mora em Lajeado!");
        }
    }
}