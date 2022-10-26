package questao05;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {
        
        double at, ac, r;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a área total do terreno: ");
        at =  scan.nextFloat();
        System.out.println("Informe a área construída do terreno: ");
        ac = scan.nextDouble();
        
        r = (5 * ac) + (3.8 * (at - ac));
        System.out.println("O valor total a ser pago é de R$ "+r);
        
    }
    
}
