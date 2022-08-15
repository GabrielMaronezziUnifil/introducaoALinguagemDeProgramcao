import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,i, area=0;

        System.out.println("informe a quantidade de lados de um poligono");
        l = sc.nextInt();
        int m[] = new int[l];
        for(i=0;i<l;i++) {
            System.out.println("informe um dos lados de um poligono");
            m[i] = sc.nextInt();
            area = area + m[i];
        }
        if(l == 3){
            System.out.println("E UM TRIANGULO E SUA AREA E: "+ area / 2 );
        }else if(l == 4){
            System.out.println("E UM QUADRADO E SUA AREA E:" + area);
        }else if(l == 5){
            System.out.println("E UM PENTAGONO");
        }else if(l < 3){
            System.out.println("NAO E UM POLIGONO");
        }else if(l > 5){
            System.out.println("POLIGONO NAO IDENTIFICADO");
        }
    }
}
