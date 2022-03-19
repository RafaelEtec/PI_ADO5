package Estrutura_de_Repeticao;
import java.util.Scanner;
/**
   por Rafael Ferreira Goulart
**/
public class PI_ADO5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        boolean saida = false;
        String menu = 
                  "O que você deseja fazer?\n"
                + "<1> Instruções\n"
                + "<2> Jogar\n"
                + "<3> Créditos\n"
                + "<4> Sair \n";
        
        System.out.println(menu);
        int escolhaMenu = ent.nextInt();
        
        do {
            switch (escolhaMenu) {
                case 1:
                    System.out.println("Você escolheu as Instruções.\n");
                    System.out.println(menu);
                    escolhaMenu = ent.nextInt();
                    break;
                case 2:
                    System.out.println("Você escolheu Jogar.\n");
                    System.out.println(menu);
                    escolhaMenu = ent.nextInt();
                    break;
                case 3:
                    System.out.println("Você escolheu os Créditos.\n");
                    System.out.println(menu);
                    escolhaMenu = ent.nextInt();
                    break;
                case 4:
                    System.out.println("Você escolheu Sair do Programa.\n");
                    saida = true;
                    break;
                default:
                    System.out.println(
                          "Você não escolheu nada ou inseriu um número inutilizável!\n"
                        + "Favor insira novamente o número: ");
                    escolhaMenu = ent.nextInt();
                    break;
            }
        } while (!saida);
    }
}