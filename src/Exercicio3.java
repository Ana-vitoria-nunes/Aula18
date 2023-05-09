import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Qual o tamanho da lista que deseja: ");
        int tamanhoLista= entrada.nextInt();
        List<Integer>ListaNumeros= retornoListaNumeros(tamanhoLista);

        adicionarValorLista(ListaNumeros,tamanhoLista);
        System.out.println("A media dos valores adicionados é: "+mediaLista(ListaNumeros));

    }
    public static List<Integer>retornoListaNumeros(int tamanhoLista){
        List<Integer>lista=new ArrayList<>(tamanhoLista);

        return lista;
    }
    public static Boolean adicionarValorLista(List<Integer>lista,int tamamhoLista){
        Scanner entrada=new Scanner(System.in);

        for (int i=0; i<tamamhoLista; i++){
            System.out.println("Digite o "+(i+1)+"valor");
            lista.add(entrada.nextInt());
        }
        return true;
    }
    public static double mediaLista(List<Integer>lista){
        double media=0;

        for (int i=0;i<lista.size();i++){
            media=media+lista.get(i);
        }
        media=media/lista.size();
        return media;
    }
}
