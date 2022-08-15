import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Informe o valor de n");
        n = sc.nextInt();
        if (n > 0) {
            System.out.println("n maior que zero entao encontrar o dobro");
            System.out.println("n = " + n * 2);
        } else {
            System.out.println("n menor que zero entao encontrar o triplo");
            System.out.println("n = " + n * 3);
        }
    }
}
