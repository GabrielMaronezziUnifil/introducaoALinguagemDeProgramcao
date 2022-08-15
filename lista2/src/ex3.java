import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, delta;
        float sqrtdelta, raiz1, raiz2;
        System.out.println("Informe o inteiro a");
        a = sc.nextInt();
        if (a <= 0) {
            System.exit(0);
        }
        System.out.println("Informe o inteiro b");
        b = sc.nextInt();

        System.out.println("informe o inteiro c");
        c = sc.nextInt();

        delta = (b * b) - (4 * a * c);
        sqrtdelta = (float) Math.sqrt(delta);

        if (delta < 0) {
            System.out.println("A equacao nao possui valores reais");
            System.exit(0);
        } else if (delta == 0) {
            raiz1 = ((-1) * b + sqrtdelta) / (2 * a);
            System.out.println(" O delta tem apenas uma raiz real igaul a :" + raiz1);

        }
        if (delta > 0) {
            raiz1 = ((-1) * b + sqrtdelta) / (2 * a);
            raiz2 = ((-1) * b - sqrtdelta) / (2 * a);
            System.out.println("raiz 1 = " + raiz1);
            System.out.println("raiz 2 = " + raiz2);
        }
    }
}