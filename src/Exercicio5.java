import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {

        System.out.println("[------- Ver quais são os números impares até 50 --------]");
        ArrayList<Integer> impar = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();

        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0){
                par.add(i);
            } else {
                impar.add(i);
            }
        }

        System.out.println("Esses números são impares: " + impar);
    }
}
