package questao04;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] num = new int[10]; //Números

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe o número " + (i + 1) + ":");
            num[i] = Integer.parseInt(scan.nextLine());

        }

        for (int i = 0; i < 10; i++) {

            if (num[i] == 1 || num[i] == 2) {

                System.out.println("O número " + num[i] + " é primo!");

            } else if (primo(num[i]) == true) {

                System.out.println("O número " + num[i] + " é primo!");

            }

        }

    }

    public static boolean primo(int a) {

        for (int j = 2; j < a; j++) {

            if (a % j == 0) {

                return false;

            }

        }

        return true;

    }

}
