package questao05;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num; //Número
        float adi; //Adição
        float sub; //Subtração
        float mul; //Multiplicação
        float div; //Divisão

        System.out.println("Informe um número: ");
        num = Float.parseFloat(scan.nextLine());

        print("adição");
        for (int i = 0; i <= 10; i++) {

            adi = i + num;
            System.out.println(i + " + " + num + " = " + adi);

        }

        print("subtração");
        for (int i = 0; i <= 10; i++) {

            sub = i - num;
            System.out.println(i + " - " + num + " = " + sub);

        }

        print("multiplicação");
        for (int i = 0; i <= 10; i++) {

            mul = i * num;
            System.out.println(i + " * " + num + " = " + mul);

        }

        print("divisão");
        for (int i = 0; i <= 10; i++) {

            div = i / num;
            System.out.println(i + " / " + num + " = " + div);

        }

    }

    public static void print(String a) {

        System.out.println("Tabuada da " + a + ":");

    }

}
