#include <stdio.h>
#include <stdlib.h>

main(){
	
	int n;
	
	printf("Informe o número do mês: \n");
	      scanf("%d", &n);
	      
	switch(n){
		
		case 1: printf("\nJANEIRO\n");
		break;
		
		case 2: printf("\nFEVEREIRO\n");
		break;
		
		case 3: printf("\nMARÇO\n");
		break;
		
		case 4: printf("\nABRIL\n");
		break;
		
		case 5: printf("\nMAIO\n");
		break;
		
		case 6: printf("\nJUNHO\n");
		break;
		
		case 7: printf("\nJULHO\n");
		break;
		
		case 8: printf("\nAGOSTO\n");
		break;
		
		case 9: printf("\nSETEMBRO\n");
		break;
		
		case 10: printf("\nOUTUBRO\n");
		break;
		
		case 11: printf("\nNOVEMBRO\n");
		break;
		
		case 12: printf("\nDEZEMBRO\n");
		break;
		
		default: printf("\nMÊS INVALIDO\n");
		
	}
	
	system("PAUSE");
	
}
