#include <stdio.h>
#include <stdlib.h>

main(){
	
	int idade, quant;
	float media, soma;
	
	do{
		
		printf("Informe a idade do aluno: \n");
		      scanf("%d", &idade);
		      
		if(idade > 0){
			
			soma += idade;
			quant++;
			
		}else{
			
			printf("Idade inválida");
			
		}
		
	}while(idade > 0);
	
	media = soma / quant;
    
    printf("A média das idades é %.1f\n", media);
	
	system("PAUSE");
	
}
