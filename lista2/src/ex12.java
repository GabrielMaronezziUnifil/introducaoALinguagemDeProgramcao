import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1, p2, p3, ma, me, n;
        System.out.println("infrome o numero do aluno");
        n = sc.nextInt();
        System.out.println("informe o valor da prova 1:");
        p1 = sc.nextInt();
        System.out.println("informe o valor da prova 2:");
        p2 = sc.nextInt();
        System.out.println("informe o valor da prova 3:");
        p3 = sc.nextInt();
        me = (p1 + p2 + p3) / 3;
        ma = (((p1 + p2) * 2) + (p3 * 3) + me) / 7;
        if (ma > 60) {
            if (ma >= 90) {
                System.out.println("numero do aluno: " + n + " notas: " + p1 + " " + p2 + " " + p3 + " media dos exercicios: " + me + " media de aproveitamento: " + me + "Conceito 'A' Aprovado");
            } else if (ma >= 75 && ma < 90) {
                System.out.println("numero do aluno: " + n + " notas: " + p1 + " " + p2 + " " + p3 + " media dos exercicios: " + me + " media de aproveitamento: " + me + "Conceito 'B' Aprovado");
            } else if (ma >= 60 && ma < 75) {
                System.out.println("numero do aluno: " + n + " notas: " + p1 + " " + p2 + " " + p3 + " media dos exercicios: " + me + " media de aproveitamento: " + me + "Conceito 'C' Aprovado");
            }
        } else if (ma < 60) {
            if (ma >= 40 && ma < 60) {
                System.out.println("numero do aluno: " + n + " notas: " + p1 + " " + p2 + " " + p3 + " media dos exercicios: " + me + " media de aproveitamento: " + me + "Conceito 'D' Reprovado");
            } else if (ma < 40) {
                System.out.println("numero do aluno: " + n + " notas: " + p1 + " " + p2 + " " + p3 + " media dos exercicios: " + me + " media de aproveitamento: " + me + "Conceito 'E' Reprovado");
            }
        }
    }
}
