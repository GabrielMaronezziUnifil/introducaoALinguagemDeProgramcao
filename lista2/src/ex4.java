import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b,c;
        System.out.println("Informe um valor para o inteiro A");
        a = sc.nextInt();
        System.out.println("Informe um valor para o inteiro B");
        b = sc.nextInt();
        System.out.println("Informe um valor para o inteiro C");
        if(a == b){
            c = (a + b);
            System.out.println("C = "+ c);
        } else{
            c = a * b;
            System.out.println("C = "+ c);
        }
    }
}
