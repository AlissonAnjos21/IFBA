package questao03;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        
        double d, r;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor em dólar: ");
        d = scan.nextDouble();
        
        r = d * 5.81;
        System.out.println("US$ "+d+" equivalem a R$ "+r);
        
    }
    
}
