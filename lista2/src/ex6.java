import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        System.out.println("Informe um valor para o inteiro A :");
        a = sc.nextInt();
        System.out.println("Informe um valor para o inteiro B: ");
        b = sc.nextInt();
        System.out.println("Informe um valor para o inteiro C: ");
        c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a+ " ");
            if(b > c) {
                System.out.print(b +" "+ c);
            } else {
                System.out.print(c +" "+ b);
            }
        } else if(b > a && b > c) {
            System.out.print(b + " ");
            if(a > c) {
                System.out.print(a +" "+ c);
            } else {
                System.out.print(c +" "+ a);
            }
        } else if(c > a && c > b) {
            System.out.print(c+ " ");
            if(a > b) {
                System.out.print(a +" "+ b);
            } else {
                System.out.print(b +" "+ a);
            }
        }
    }
}
