import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("R$ #,##0.00");
        ArrayList<Double> precosDigitados = new ArrayList<>();


        System.out.println("[------- Ver o produto mais barato -------]");
        System.out.println("[----- Digite o preço dos 3 produtos -----]");
        for (int i = 0; i < 3; i++){
            System.out.println("[Digite o " + (i + 1) + " produto: ");
            precosDigitados.add(sc.nextDouble());
        }

       double minimo = Math.min(precosDigitados.get(0), Math.min(precosDigitados.get(1), precosDigitados.get(2)));

        System.out.println("Compre o produto: " + formatar.format(minimo));
    }
}
