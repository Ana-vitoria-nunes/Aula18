import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Integer>numeros=new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);

        System.out.println("\n-----Lista inicial-----");
        for (int i=0; i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("\n-----Lista atualizada-----");
        numeros.add(4,50);
        for (int i=0; i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
    }
}
