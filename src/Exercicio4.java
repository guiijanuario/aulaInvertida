import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numero = new ArrayList<>();

        System.out.println("[------- Ler o maior número --------]");
        System.out.println("Digite 5 números");

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite o número " + i + ":");
            numero.add(scanner.nextInt());
        }

        int maiorNumero = 0;

        for (int i = 1; i < numero.size(); i++){
            int numeroAtual = numero.get(i);
            if (numeroAtual > maiorNumero) {
                maiorNumero = numeroAtual;
            }
        }
        System.out.println("O maior número digitado é: " + maiorNumero);


    }
}
