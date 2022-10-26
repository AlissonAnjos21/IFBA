package questao04;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        
        float c, l, a, p;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a medida do comprimento do retângulo: ");
        c = scan.nextFloat();
        System.out.println("Informe a medida do lado do retângulo: ");
        l = scan.nextFloat();
        
        a = c * l;
        p = (2 * c) + (2 * l);
        
        System.out.println("A área do retângulo é: "+a+"\nO perímetro do retângulo é "+p);
        
    }
    
}
