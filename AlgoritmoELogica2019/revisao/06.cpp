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
			
			printf("Idade inv�lida");
			
		}
		
	}while(idade > 0);
	
	media = soma / quant;
    
    printf("A m�dia das idades � %.1f\n", media);
	
	system("PAUSE");
	
}
