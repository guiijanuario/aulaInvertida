import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do peixe: ");
        double pesoPeixe = scanner.nextDouble();

        double pesoExcedente = pesoPeixe - 50;

        DecimalFormat formatador = new DecimalFormat("0.00");

        if(pesoExcedente > 0){
            double multaPesoExcedente = pesoExcedente * 4;

            System.out.println("O peso excedente é de : " + formatador.format(pesoExcedente) + "kg");
            System.out.println("Ele precisa pagar de multa: " + "R$ " + formatador.format(multaPesoExcedente));
        }else{
            System.out.println("Ele Não precisa pagar multa!");
        }
    }
}
