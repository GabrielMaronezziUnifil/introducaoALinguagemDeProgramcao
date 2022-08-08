import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fp;
        double n;
        System.out.println("informe o valor do produto");
        n = sc.nextDouble();
        System.out.println("forma de pagamento");
        System.out.println("1 A vista em dinheiro ou cheque, recebe 10% de desconto\n" +
                "2 A vista no cartao de credito, recebe 15% de desconto\n" +
                "3 Em duas vezes, preco normal de etiqueta sem juros\n" +
                "4 Em duas vezes, preco normal de etiqueta mais juros de 10%.");
        fp = sc.nextInt();
        if (fp == 1){
            System.out.println("o valor final do pagamento sera: "+ (n - (n * 0.1)) );
        } else if(fp == 2){
            System.out.println("o valor final do pagamento sera: "+ (n - (n * 0.15)) );
        } else if(fp == 3){
            System.out.println("o valor  do pagamento sera duas vezes de  : "+ n/2 );
        } else if(fp == 4){
            System.out.println("o valor  do pagamento sera duas vezes de  "+ ((n + (n * 0.1))/2));
        }
    }
}
