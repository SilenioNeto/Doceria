package br.ucsal.bes.poo20222.avaliacao02.tui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TUIUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String obterString(String mensagem) {
        mostreMensagem(mensagem);
        return scanner.nextLine();
    }

    public static int obterInt(String mensagem) {
        while (true) {
            mostreMensagem(mensagem);
            try {
                int valor = scanner.nextInt();
                scanner.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Digite um número inteiro.");
            }
        }
    }

    public static float obterFloat(String mensagem) {
        while (true) {
            mostreMensagem(mensagem);
            try {
                float valor = scanner.nextFloat();
                scanner.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Digite um número.");
            }
        }
    }


    private static void mostreMensagem(String mensagem) {
        System.out.print(mensagem + " ");
    }
}
