import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String>nomes=new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Mylena");
        nomes.add("Raissa");
        nomes.add("Bruna");
        nomes.add("Paula");
        nomes.add("Paola");

        for (int i = 0; i < nomes.size(); i++) {
            nomes.remove(new String("Paula"));
            System.out.println(nomes.get(i));
        }
    }
}