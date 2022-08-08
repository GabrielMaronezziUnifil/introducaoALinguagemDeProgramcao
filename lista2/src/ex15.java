import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Informe um valor para o angulo A");
        a = sc.nextInt();
        System.out.println("Informe um valor para o angulo B");
        b = sc.nextInt();
        System.out.println("Informe um valor para o angulo C");
        c = sc.nextInt();
        if((a+b+c) < 90){
            System.out.println("TRIANGULO RETANGULO");
        }else if ((a+b+c) == 90){
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if ((a+b+c) > 90){
            System.out.println("TRIANGULO ACUTANGULO");
        }
    }
}
