package questao06;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num; //Número
        int op; //Operação

        System.out.println("Informe um número: ");
        num = Float.parseFloat(scan.nextLine());

        System.out.println("Qual operação de tabuada você gostaria de realizar?\nUse:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        do {

            op = Integer.parseInt(scan.nextLine());

            if (op < 1 || op > 4) {

                System.out.println("Valor inválido!\nDigite novamente!");

            }

        } while (op < 1 || op > 4);

        switch (op) {

            case 1:

                print("adição");

                for (int i = 0; i <= 10; i++) {

                    float val; //Valor
                    val = num + i;
                    System.out.println(num + " + " + i + " = " + val);

                }

                break;

            case 2:

                print("subtração");

                for (int i = 0; i <= 10; i++) {

                    float val; //Valor
                    val = num - i;
                    System.out.println(num + " - " + i + " = " + val);

                }

                break;

            case 3:

                print("multiplicação");

                for (int i = 0; i <= 10; i++) {

                    float val; //Valor
                    val = num * i;
                    System.out.println(num + " * " + i + " = " + val);

                }

                break;

            case 4:

                print("divisão");

                for (int i = 0; i <= 10; i++) {

                    float val; //Valor
                    val = num / i;
                    System.out.println(num + " / " + i + " = " + val);

                }

                break;

        }

    }

    public static void print(String a) {

        System.out.println("Você escolheu " + a + "!");

    }

}
