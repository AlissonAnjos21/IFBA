package questao01;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        
        int n1, n2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scan.nextInt();
        
        if(n1 == n2){
            System.out.println("Os números são iguais");
            
        }else if(n1 > n2){
            System.out.println("Os números são diferentes\nO primeiro número é maior");
         
        }else{
            System.out.println("Os números são diferentes\nO segundo número é maior");
            
        }
        
        
    }
    
}
