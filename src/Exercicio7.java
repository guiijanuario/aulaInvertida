import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            System.out.println("Insira o " + i + "ª " + "número inteiro: " );
            numeros.add(scanner.nextInt());
        }

        for(int numero : numeros){
            System.out.println("Os números inseridos foram: " + numero);
        }


    }
}
