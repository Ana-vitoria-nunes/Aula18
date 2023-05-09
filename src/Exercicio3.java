import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de números com funções");
        System.out.println("=========================================================");
        mostrarTodosOsValoresListaNumero(retornarListaNumeros());


        System.out.println("=========================================================");
        List<Integer> listaNumerosArray = retornarListaNumeros();
        mostrarTodosOsValoresListaNumero(listaNumerosArray);


        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");


        System.out.println("=========================================================");
        List<String> listaNomesComQuantidade = mostrarNomesComPosicao(retornarListaNumeros());
        System.out.println("Exemplo de array = " + listaNomesComQuantidade);
    }
    public static List<Integer> retornarListaNumeros() {
        Scanner valorr=new Scanner(System.in);
        System.out.println("blabla: ");
        int receptor=valorr.nextInt();

        List<Integer> listaNumero = new ArrayList<>(receptor);

        return listaNumero;
    }

    public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {

        for (int i = 0; i < numeros.size(); i++) {
            
            System.out.println(numeros.get(i));
        }
    }
    public static List<String> mostrarNomesComPosicao(List<Integer> quantidade) {
        List<String> nomesExibir = new ArrayList<>();
        for (int i = 0; i < quantidade.size(); i++) {
            nomesExibir.add(quantidade.get(i) +" nomes");
            System.out.println(nomesExibir.get(i));
        }
        return nomesExibir;
    }
}
