import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            System.out.println("Insira o " + i + "ª " + "número inteiro: " );
            numeros.add(scanner.nextInt());
        }

        System.out.println("Não reverso: " + numeros);

        Collections.reverse(numeros);

        System.out.println("Reverso:" + numeros);

    }
}
