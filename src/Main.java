import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo da adivinhação!");

        int numeroSecreto = 7;
        int totalDeTentativas = 5;

        for (int i = 0; i < totalDeTentativas; i++) {
            System.out.print("Tente adivinhar o número secreto de um a 10: ");
            int palpite = leitura.nextInt();
            if(palpite == numeroSecreto) {
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
        System.out.println("Fim de Jogo");
    }
}
