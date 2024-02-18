//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contadorPositivo = 0;
        int contadorNegativo = 0;

        for (int i = 1; i <= 15; i++) {
            int numero;
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if(numero > 0) {
                contadorPositivo++;
            }else{
                contadorNegativo++;
            }

        }
        System.out.println("Positivos: " + contadorPositivo);
        System.out.println("Negativos: " + contadorNegativo);
    }
}