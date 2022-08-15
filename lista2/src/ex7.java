import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n % 2 == 0){
            n = n +5;
            System.out.println(n);
        }else{
            n = n + 8;
            System.out.println(n);
        }
    }
}
