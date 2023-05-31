import java.util.ArrayList;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] semana = {"", "Domingo","Segunda-feira!","Terça-feira!","Quarta-feira!","Quinta-feira!","Sexta-feira!","Sábado!"};

        System.out.println("Digite um número da semana: ");
        int dia = scanner.nextInt();

        System.out.println("O dia da semana que você digitou é: " + semana[dia]);

    }
}
