package questao01;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int an; //Ano Nascimento
        int aa; //Ano Atual
        int i; //Idade

        System.out.println("Informe o ano de nascimento: ");
        an = Integer.parseInt(scan.nextLine());

        System.out.println("Informe o ano atual: ");
        aa = Integer.parseInt(scan.nextLine());

        i = aa - an;

        System.out.println("Você possui (ou possuirá) " + i + " anos");

    }

}
