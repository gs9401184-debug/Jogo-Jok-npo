package br.senai.sp.jandira.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class GameJokenpo {
    Scanner leitor = new Scanner(System.in);
    Scanner leitor2 = new Scanner(System.in);
    Random random = new Random();

    int jogador;
    int computador;
    int jogarNovamente;

    public void escolhaOpcao() {


        //opções de escolha.
        System.out.println("----------------------------------------------------");
        System.out.println("*** Vamos jogar Jokenpô! ***");
        System.out.println("----------------------------------------------------");
        System.out.println("Escolha uma opção: ");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("----------------------------------------------------");

        //Escolha do jogador.
        System.out.print("Digite a sua escolha: ");
        jogador = leitor.nextInt();

        if (jogador < 1 || jogador > 3) {
            System.out.println("Opção Invalida! Tente novamente ");
            escolhaOpcao();
        }
        computador = random.nextInt(3) + 1;

        System.out.println("Você escolheu: " + escolha(jogador));
        System.out.println("Computador escolheu: " + escolha(computador));
        verificarResultado();


    }


    public  String escolha(int opcao){
        if (opcao == 1) {
            return "Pedra";
        } else if (opcao == 2) {
            return "Papel";
        } else if (opcao == 3) {
            return "Tesoura";
        } else {
            return "Desconhecido";
        }

    }

    public void verificarResultado() {

        if (jogador == computador) {
            System.out.println(" E M P A T E !");

        } else if (jogador == 1 && computador == 3) {
            System.out.println("* * * V O C Ê  V E N C E U ! ! ! * * *");
            System.out.println("----------------------------------------------------");


        } else if (jogador == 2 && computador == 1) {
            System.out.println("* * * V O C Ê  V E N C E U ! ! ! * * *");
            System.out.println("----------------------------------------------------");


        } else if (jogador == 3 && computador == 2) {
            System.out.println("* * * V O C Ê  V E N C E U ! ! ! * * *");
            System.out.println("----------------------------------------------------");


        } else {
            System.out.println(" V O C Ê P E R D E U ! ! ! ");
            System.out.println(" BOA SORTE NA PRÓXIMA!");
            System.out.println("----------------------------------------------------");

        }
        novoJogo();

    }
    public void novoJogo(){
        //Dar opção de jogar novamente.
        System.out.println("Deseja jogar novamente ? Digite 1 para SIM ou 2 para NÃO ");
        jogarNovamente = leitor2.nextInt();
        System.out.println("----------------------------------------------------");


        if (jogarNovamente ==1){
            escolhaOpcao();

        }else if (jogarNovamente == 2){
            System.out.println("MUITO OBRIGADO POR JOGAR!");
            System.out.println("----------------------------------------------------");



        }else {
            System.out.println(" *** ERRO! Por Favor digitar apenas 1  ou 2! *** ");
            novoJogo();

        }
    }
}