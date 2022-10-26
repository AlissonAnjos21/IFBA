package aulaum;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AulaUm {

    public static void main(String[] args) {

        int a;
        float b;
        double c;
        String nome;

        //String nome = JOptionPane.showInputDialog(null, "Digite um número");
        //JOptionPane.showMessageDialog(null, nome);
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = ler.nextLine();
        System.out.println(nome);

    }

}
