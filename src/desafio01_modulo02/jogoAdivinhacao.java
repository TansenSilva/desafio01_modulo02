package desafio01_modulo02;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("-------Jogo da Adivinhação-------");
        System.out.println();
        System.out.println("**Tente descobrir qual numero foi o sorteado**");
        System.out.println();
        System.out.println("-----Como funciona o jogo?-----");
        System.out.println();
        System.out.println("- Escolha a dificuldade do jogo;\n- Digite um numero aleatório dentro do intervalo escolhido;\n- Se o numero digitado for igual ao sorteado você vence;");
        System.out.println("- Se o número digitado estiver próximo do número sorteado você ganha 5 pontos\n- Se o número digitado estiver distante do sorteado você perde o jogo;");
        System.out.println();
        System.out.print("Selecione a Dificuldade do jogo: (1) Fácil -  (2) Normal -  (3) Difícil : ");

        int numeroaleatorio = 0;
        int numeroUsuario = 0;
        int dificuldade = input.nextInt();

        switch (dificuldade){
            case 1:
                numeroaleatorio = aleatorio.nextInt(10);
                System.out.print("Digite um número aleatório de 0 a 10: ");
                numeroUsuario = input.nextInt();
                break;
            case 2:
                numeroaleatorio = aleatorio.nextInt(50);
                System.out.print("Digite um número aleatório de 0 a 50: ");
                numeroUsuario = input.nextInt();
                break;
            case 3:
                numeroaleatorio = aleatorio.nextInt(100);
                System.out.print("Digite um número aleatório de 0 a 100: ");
                numeroUsuario = input.nextInt();
                break;
        }

        int numero = 0;
        int pontos = 0;

        System.out.println("Teste --> número sorteado --> "+ numeroaleatorio);

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
