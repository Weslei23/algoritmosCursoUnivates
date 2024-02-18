//2. Escrever um programa que leia as respostas de uma pesquisa de
//satisfação contendo 10 entrevistados. As perguntas para cada entrevistado são 3:
//a) Você considera que o atendimento foi satisfatório? (responder “s” ou “n”)
//b) Você voltaria para ser atendido neste estabelecimento? (responder “s” ou “n”)
//c) Você recomendaria para um amigo, vizinho ou familiar? (responder “s” ou “n”)
//Informar ao final, a quantidade de Sim’s e Não’s para cada pergunta.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contadorSim1 = 0;
        int contadorNao1 = 0;
        int contadorSim2 = 0;
        int contadorNao2 = 0;
        int contadorSim3 = 0;
        int contadorNao3 = 0;


        for (int i = 0; i < 10; i++) {

            char resposta1;
            System.out.println("a) Você considera que o atendimento foi satisfatório? (responder “s” ou “n”)");
            resposta1 = scanner.next().charAt(0);
            if (resposta1 == 's') {
                contadorSim1++;
            } else if (resposta1 == 'n') {
                contadorNao1++;
            }
            char resposta2;
            System.out.println("b) Você voltaria para ser atendido neste estabelecimento? (responder “s” ou “n”)");
            resposta2 = scanner.next().charAt(0);
            if (resposta2 == 's') {
                contadorSim2++;
            } else if (resposta2 == 'n') {
                contadorNao2++;
            }
            char resposta3;
            System.out.println("c) Você recomendaria para um amigo, vizinho ou familiar? (responder “s” ou “n”)");
            resposta3 = scanner.next().charAt(0);
            if (resposta3 == 's') {
                contadorSim3++;
            } else if (resposta3 == 'n') {
                contadorNao3++;
            }
        }
        System.out.println("Sim's da pergunta 1: " + contadorSim1);
        System.out.println("Não's da pergunta 1: " + contadorNao1);
        System.out.println("Sim's da pergunta 2: " + contadorSim2);
        System.out.println("Não's da pergunta 2: " + contadorNao2);
        System.out.println("Sim's da pergunta 2: " + contadorSim3);
        System.out.println("Não's da pergunta 2: " + contadorNao3);
    }
}