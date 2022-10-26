#include <stdio.h>
#include <stdlib.h>

main(){
	
	int n;
	
	printf("Informe um número de 1 até 7: \n");
	      scanf("%d", &n);
	      
	switch(n){
		
		case 1: printf("\nDomingo\n");
		break;
		
		case 2: printf("\nSegunda-Feira\n");
		break;
		
		case 3: printf("\nTerça-Feira\n");
		break;
		
		case 4: printf("\nQuarta-Feira\n");
		break;
		
		case 5: printf("\nQuinta-Feira\n");
		break;
		
		case 6: printf("\nSexta-Feira\n");
		break;
		
		case 7: printf("\nSábado\n");
		break;
		
		default: printf("\nValor Inválido!!!\n");
		
	}
	
	system("PAUSE");
	
}
