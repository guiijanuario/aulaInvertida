import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Insira o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if ( num1 > num2){
            for( int i = num2 + 1; i < num1; i++){
                numeros.add(i);
            }
        }else if (num2 > num1){
            for( int i = num2 - 1; i >= num1; i--){
                numeros.add(i);
            }
        }

        System.out.println("O intervalo entre os números que você inseriu é: " + numeros);


    }
}
