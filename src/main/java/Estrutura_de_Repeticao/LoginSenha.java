package Estrutura_de_Repeticao;
import java.util.Scanner;
/**
   por Rafael Ferreira Goulart
**/
public class LoginSenha {
    public static void main(String[] args) {
        String user = "Rafael";
        String password = "123";
        String login,senha;
        String saida = "";
        Scanner ent = new Scanner(System.in);
        int nTentativas = 0;
        
        boolean tAcerto = false;
        
        do {
            System.out.println("Digite o Login: ");
            login = ent.next();
            System.out.println("Digite a Senha: ");
            senha = ent.next();
            nTentativas++;
            
            if (login.equalsIgnoreCase(user) && senha.equals(password)) {
                tAcerto = true;
                saida = "Login e Senha Corretos";
            }
            if (nTentativas == 3) {
                saida = "Número de Tentativas excedido!";
                tAcerto = true;
            }
        } while (!tAcerto);
        
        System.out.println(saida);
    }
}