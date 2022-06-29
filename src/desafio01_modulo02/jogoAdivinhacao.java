package desafio01_modulo02;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------Jogo da Adivinhação-------");
        System.out.println();
        System.out.println("Digite um número aleatório de 0 a 10: ");
        int numeroUsuario = input.nextInt();

        Random aleatorio = new Random();
        int numeroaleatorio = aleatorio.nextInt(10);

        System.out.println(numeroaleatorio);

        int pontos = 0;

        if (numeroaleatorio==numeroUsuario){
            System.out.println("Parabéns você ganhou!!!");
            pontos += 10;
            System.out.println("Você conquistou "+ pontos +" pontos!");
        }

        else if (numeroUsuario < numeroaleatorio - 1 || numeroUsuario > numeroaleatorio + 1) {
                System.out.println("Voce perdeu!");
            }

        else {
            System.out.println("Voce ganhou 5 pontos");
        }
    }
}
