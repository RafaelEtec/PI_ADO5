package Estrutura_de_Repeticao;
import java.util.Scanner;

public class PI_ADO5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        int escolhaMenu = 0;
        int saida = 0;
        
        System.out.println(
                  "O que você deseja fazer?\n"
                + "<1> Instruções\n"
                + "<2> Jogar\n"
                + "<3> Créditos\n"
                + "<4> Sair \n");
        escolhaMenu = ent.nextInt();
        
        do {
            switch (escolhaMenu) {
                case 1:
                    System.out.println("Você escolheu entrar nas Instruções.");
                    saida = 1;
                    break;
                case 2:
                    System.out.println("Você escolheu entrar nas Jogar.");
                    saida = 2;
                    break;
                case 3:
                    System.out.println("Você escolheu entrar nas Créditos.");
                    saida = 3;
                    break;
                case 4:
                    System.out.println("Você escolheu Sair do Programa.");
                    saida = 4;
                    break;
            }
        } while (escolhaMenu != 4);
    }
}