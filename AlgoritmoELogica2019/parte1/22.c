#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	int lados;
	float tamanho;
	
	printf("Informe o n�mero de lados do pol�gono: \n");
	      scanf("%d", &lados);
	
	printf("Informe o tamanho dos lados do pol�gono: \n");
	      scanf("%ff", &tamanho);
	      
	switch(lados){
		double area;
		  case 3:
		  	
		  	area = (tamanho * tamanho * 1.73 ) / 4;
		        printf("A �rea do pol�gono �: %f cm quadrados\n", area);
		  	
			break;
		
		  case 4:
		  	
		  	area = (tamanho * tamanho);
		        printf("A �rea do pol�gono �: %f cm quadrados\n", area);
		  	
			break;
		  
		  case 6:
		  	
		  	area = (6 * tamanho * tamanho * 1.73 ) / 4;
		        printf("A �rea do pol�gono �: %f cm quadrados\n", area);
		  	
			break;
		  
		default:
			
			printf("N�o sei calcular a �rea\n");
			
	}
	
	system("PAUSE");
	
}
