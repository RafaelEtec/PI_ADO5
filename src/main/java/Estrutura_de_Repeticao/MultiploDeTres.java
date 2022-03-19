package Estrutura_de_Repeticao;
import java.util.Scanner;

public class MultiploDeTres {
    public static void main(String[] args) {
        int i = 1;
        
        do {
            System.out.println(i+"° múltiplo: "+(i * 3));
            i++;
        } while (i <= 100);
    }
}