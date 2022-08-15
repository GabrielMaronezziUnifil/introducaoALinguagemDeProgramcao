
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Informe um valor para o inteiro A");
        a = sc.nextInt();
        System.out.println("Informe um valor para o inteiro B");
        b = sc.nextInt();
        System.out.println("Informe um valor para o inteiro C");
        c = sc.nextInt();

        if((a + b) < c){
            System.out.println((a+b));
        }
    }
}
