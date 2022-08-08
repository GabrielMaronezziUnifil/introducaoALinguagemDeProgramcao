import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int tempo, sexo, ec;


        System.out.println("Informe o nome da pessoa:");
        nome = sc.next();
        System.out.println("Informe o sexo da pessoa:");
        System.out.println("1 para femenino");
        System.out.println("2 para masculino");
        sexo = sc.nextInt();
        System.out.println("Informe o estado civil da pessoa:");
        System.out.println("1 para solteiro");
        System.out.println("2 para casado");
        ec = sc.nextInt();

        if(sexo == 1 ){
            if(ec == 2) {
                System.out.println("Informe o tempo que esta casada (Anos):");
                tempo = sc.nextInt();
            }
        }
    }
}
