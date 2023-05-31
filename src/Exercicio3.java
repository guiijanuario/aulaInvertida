import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[------- Tabuada --------]");
        System.out.println("Digite um número que você queria fazer a tabuada:");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++){
            int tabuada = i * numero;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
    }

}
