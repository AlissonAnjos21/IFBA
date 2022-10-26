package questao02;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        
        String senha, chave;
        float n1, n2, r;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cadastre uma senha: ");
        senha = scan.next();
        
        System.out.println("Digite o primeiro valor: ");
        n1 = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        n2 = scan.nextFloat();
        
        r = n1 / n2;
        
        System.out.println("Digite a senha: ");
        chave = scan.next();
        
        if(chave.equals(senha)){
            
            System.out.println("O resultado da divisão foi: "+r);
            
        }else{
            
            System.out.println("ERRO!");
            
        }
        
        
    }
    
}
