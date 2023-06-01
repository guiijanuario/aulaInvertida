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
        int maior, menor = 0;

        if(num1 > num2){
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }

        if(maior == menor){
            System.out.println("Não é possivel colocar 2 números iguais.");
            return;
        }

        for (int i = menor + 1; i < maior; i++) {
            numeros.add(i);
        }

        System.out.println("O intervalo entre os números que você inseriu é: " + numeros);

//        if ( num1 > num2){
//            for( int i = num2 + 1; i < num1; i++){
//                numeros.add(i);
//            }
//        }else if (num2 > num1){
//            for( int i = num2 - 1; i > num1; i--){
//                numeros.add(i);
//            }
//        }  else {
//            System.out.println("Não pode ser números iguais!");
//        }

    }
}
