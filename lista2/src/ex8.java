import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 5,i,j,x;
        int v[] = new int[n];

        for(i=0;i<5;i++){
            System.out.println("Informe um numero");
            v[i] = ler.nextInt();
        }

        for (i=0;i<4;i++){
            for (j=i;j<5;j++){
                if(v[j] < v[i]){
                    x = v[i];
                    v[i] = v[j];
                    v[j] = x;
                }
            }
        }
        for(i=0;i<5;i++) {
            System.out.println(v[i]);
        }
    }
}
