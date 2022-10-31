import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random computador = new Random();

        int escolhaUsuario;
        int escolhaComputador;
        int contadorUsuario = 0;
        int contadorComputador = 0;

        while (contadorUsuario <= 3 && contadorComputador <= 3) {
            System.out.println("Escolha um número\n\n0 - Pedra\n\n1 - Papel\n\n2 - Tesoura");
            escolhaUsuario = scan.nextInt();
            escolhaComputador = computador.nextInt(2) + 0;

            System.out.println("O usuario escolheu a opção " + escolhaUsuario);
            System.out.println("O computador escolheu " + escolhaComputador);

            if (escolhaUsuario == 0 && escolhaComputador == 0) {
                System.out.println(" ---- Empate ----");

            } else if (escolhaUsuario == 0 && escolhaComputador == 1) {
                System.out.println(" ---- Computador ganhou ----");
                contadorComputador++;

            } else if (escolhaUsuario == 0 && escolhaComputador == 2) {
                System.out.println(" ---- Usuario ganhou ----");
                contadorUsuario++;

            } else if (escolhaUsuario == 1 && escolhaComputador == 0) {
                System.out.println(" ---- Usuario ganhou ----");
                contadorUsuario++;

            } else if (escolhaUsuario == 1 && escolhaComputador == 1) {
                System.out.println(" ---- Empate ----");

            } else if (escolhaUsuario == 1 && escolhaComputador == 2) {
                System.out.println(" ---- Computador ganhou ----");
                contadorComputador++;
            } else if (escolhaUsuario == 2 && escolhaComputador == 0) {
                System.out.println(" ---- Computador ganhou ----");
                contadorComputador++;
            } else if (escolhaUsuario == 2 && escolhaComputador == 1) {
                System.out.println(" ---- Usuario ganhou ----");
                contadorUsuario++;
            } else if (escolhaUsuario == 2 && escolhaComputador == 2) {
                System.out.println(" ---- Empate ----");
            }
        }
        if (contadorComputador > contadorUsuario) {
            System.out.println("Computador Wins");
        } else if (contadorComputador < contadorUsuario) {
            System.out.println("Usuario Wins");
        }

    }
}
