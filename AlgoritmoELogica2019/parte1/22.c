#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	int lados;
	float tamanho;
	
	printf("Informe o número de lados do polígono: \n");
	      scanf("%d", &lados);
	
	printf("Informe o tamanho dos lados do polígono: \n");
	      scanf("%ff", &tamanho);
	      
	switch(lados){
		double area;
		  case 3:
		  	
		  	area = (tamanho * tamanho * 1.73 ) / 4;
		        printf("A área do polígono é: %f cm quadrados\n", area);
		  	
			break;
		
		  case 4:
		  	
		  	area = (tamanho * tamanho);
		        printf("A área do polígono é: %f cm quadrados\n", area);
		  	
			break;
		  
		  case 6:
		  	
		  	area = (6 * tamanho * tamanho * 1.73 ) / 4;
		        printf("A área do polígono é: %f cm quadrados\n", area);
		  	
			break;
		  
		default:
			
			printf("Não sei calcular a área\n");
			
	}
	
	system("PAUSE");
	
}
