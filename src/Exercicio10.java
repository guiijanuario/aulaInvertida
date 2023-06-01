import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            System.out.println("Insira o " + i + "ª " + "número inteiro: " );
            numeros.add(scanner.nextInt());
        }

        for(int numero : numeros){
            int soma = numero + numero;
            int multiplicacao = numero * numero;
            System.out.println("O primeiro número inserido foi " + numero + " e a soma dele por ele mesmo é "
                    + soma + " e a multiplicação por ele mesmo é: " + multiplicacao);
        }
    }
}
