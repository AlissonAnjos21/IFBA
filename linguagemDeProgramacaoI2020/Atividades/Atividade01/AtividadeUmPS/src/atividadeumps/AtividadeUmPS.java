package atividadeumps;

import java.util.Scanner;

public class AtividadeUmPS {

    public static void main(String[] args) {

        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float media;

        Scanner ler = new Scanner(System.in);

        do {

            System.out.println("Digite a nota 1:");
            nota1 = Float.parseFloat(ler.nextLine());

            System.out.println("Digite a nota 2:");
            nota2 = Float.parseFloat(ler.nextLine());

            System.out.println("Digite a nota 3:");
            nota3 = Float.parseFloat(ler.nextLine());

            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {

                System.out.println("Alguma Nota Esta Errada Digite Novamente");

            }

        } while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10);

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {

            System.out.println("Aprovado");

        } else if (media < 3) {

            System.out.println("Reprovado Sem Direito a Final");

        } else if (media >= 3 && media < 7) {

            System.out.println("Reprovado Com Direito a Final");

        }

    }

}
