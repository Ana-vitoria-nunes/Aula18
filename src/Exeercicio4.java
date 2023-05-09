import java.util.Scanner;

public class Exeercicio4 {
    public static void main(String[] args) {
        Scanner receberNum=new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num=receberNum.nextInt();
        System.out.println("Digite o segundo número: ");
        int num1=receberNum.nextInt();

        System.out.println("\n-----Ordem decrescente-----");

        if (num>num1){
            System.out.println(num+"\n"+num1);
        }
        else {
            System.out.println(num1+"\n"+num);
        }
    }
}
