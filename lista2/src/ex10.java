import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Informe um valor para o inteiro A:");
        a = sc.nextInt();
        System.out.println("Informe um valor para o inteiro B:");
        b = sc.nextInt();
        System.out.println("Informe um valor para o inteiro C:");
        c = sc.nextInt();

        if(a >= (b + c)){
            System.out.println("NAO FORMA TRINAGULO");
        } else if(a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        } else if((a == b && a !=c) || (a == c && a != b) || (b == c && b != a)){
            System.out.println("TRIANGULO ISOSCELES");
        } else if(a != b && a != c){
            System.out.println("TRIANGULO ESCALENO");
        }

    }
}
