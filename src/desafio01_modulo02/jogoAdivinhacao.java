package desafio01_modulo02;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------Jogo da Adivinhação-------");
        System.out.println();
        System.out.println("**Tente descobrir qual numero foi o sorteado**");
        System.out.println();
        System.out.println("-----Como fuinciona o jogo?-----");
        System.out.println();
        System.out.println("- Digite um numero aleatório;\n- Se o numero digitado for igual ao sorteado você vence;");
        System.out.println("- Se o número digitado estiver próximo do sorteado você ganha 5 pontos;\n- Se o número digitado estiver distante do sorteado você perde o jogo;");
        System.out.println();
        System.out.print("Digite um número aleatório de 0 a 10: ");

        int numeroUsuario = input.nextInt();
        int numero = 0;
        Random aleatorio = new Random();
        int numeroaleatorio = aleatorio.nextInt(10);
        int pontos = 0;

        if (numeroUsuario<0){
            while (numeroUsuario<0){
                System.out.println("Digite um número maior que 0");
                numeroUsuario = input.nextInt();
            }
        }

        if (numeroaleatorio==numeroUsuario){
            System.out.println("O número sorteado foi: "+ numeroaleatorio);
            System.out.println("Parabéns você venceu!!!");
            pontos += 10;
            System.out.println("Você conquistou "+ pontos +" pontos!");
        }

        else if (numeroUsuario < numeroaleatorio - 1 || numeroUsuario > numeroaleatorio + 1) {
            System.out.println("Não foi deste vez. O número sorteado foi: "+ numeroaleatorio);
            System.out.println("-----Game Over - Voce perdeu :( -----");
            }

        else {
                pontos += 5;
                System.out.println("Você passou perto e conquistou " + pontos + " pontos!");
                System.out.print("Tente outra vez, digite outro número: ");
                numero = input.nextInt();
                while (numero==numeroUsuario) {
                pontos += 5;
                System.out.println("Foi por pouco, você conquistou mais 5 pontos. Agora você tem " + pontos + " pontos!");
                System.out.print("Tente outra vez ou digite 00 para encerrar o jogo ");
                numero = input.nextInt();
                }

            if (numero == numeroaleatorio){
                System.out.println("O número sorteado foi: "+ numeroaleatorio);
                System.out.println("Parabéns você acertou!!!");
                pontos += 10;
                System.out.println("Você conquistou "+ pontos +" pontos!");

            } else if (numero>numeroaleatorio+1 || numero<numeroaleatorio-1 && numero!=00){
                System.out.println("Não foi deste vez. O número sorteado foi: "+ numeroaleatorio);
                System.out.println("Você conquistou "+ pontos +" pontos!");
                System.out.println("-----Game Over - Voce perdeu :( -----");

            } else if (numero==00) {
                System.out.println("---Jogo finalizado pelo usuário---");
                System.out.println("Você conquistou "+ pontos +" pontos!");
            }
        }
    }
}
