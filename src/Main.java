import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random sorteador = new Random();

        System.out.println("Bem vindo ao jogo da adivinhação!");

        int numeroSecreto = sorteador.nextInt(99);
        int totalDeTentativas = 5;
        int tentativa = 0;

        for (int i = 0; i < totalDeTentativas; i++) {

            tentativa++;

            String cabecalhoNumeroDeTentativas = """
                    Tentativa %d de %d
                    """.formatted(tentativa, totalDeTentativas);

            System.out.print(cabecalhoNumeroDeTentativas);
            System.out.print("Tente adivinhar o número secreto entre 0 e 99: ");
            int palpite = leitura.nextInt();
            boolean acertou = palpite == numeroSecreto;
            if(acertou) {
                System.out.println("Parabéns, você adivinhou o número secreto!");
            } else {
                boolean maior = palpite < numeroSecreto;
                if(maior) {
                    System.out.println("Você errou. O numero secreto é maior");
                } else {
                    System.out.println(("Você errou. O numero secreto é menor"));
                }
            }
        }
        System.out.println("O número secreto era " + numeroSecreto);
        System.out.println("Fim de Jogo");
    }
}
