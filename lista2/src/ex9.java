import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int s;
        float  h;
        double pi;
        System.out.println("Informe a altura da pessoa");
        h = ler.nextFloat();
        System.out.println("informe o sexo da pessoa");
        System.out.println("1 para homem");
        System.out.println("2 para mulher");
        s = ler.nextInt();
        if(s== 1){
            pi = (72.7 * h) - 58;
            System.out.println("O peso ideal seu e: "+ pi);
        }else if(s == 2) {
            pi = (62.1 * h) - 44.7;
            System.out.println("O peso ideal seu e: " + pi);
        }
    }

}
