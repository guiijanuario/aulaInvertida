import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();


        for(int i = 1; i <= 20; i++){
            System.out.println("Insira o " + i + "ª " + "número inteiro: " );
            int numero = scanner.nextInt();
            numeros.add(numero);

            if(numero % 2 == 0) {
                par.add(numero);
            } else {
                impar.add(numero);
            }
                    }
        System.out.println("Lista com os 20 números: " + numeros);
        System.out.println("Lista com números pares: " + par);
        System.out.println("Lista com números Impares: " + impar);
    }
}
