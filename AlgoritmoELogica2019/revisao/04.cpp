#include <stdio.h>
#include <stdlib.h>

main(){
	
	int n;
	
	do{
		
		printf("Digite um valor entre 1 e 3 (zero para encerrar): \n");
		      scanf("%d", &n);
		      
		switch(n){
			
			case 1: printf ("\nFrase 1\n"); break;
			
			case 2: printf ("\nFrase 2\n"); break;
			
			case 3: printf ("\nFrase 3\n"); break;
			
			case 0: printf ("\nPROGRAMA ENCERRADO\n"); break;
			
			default: printf("\nESCOLHA OUTRO NÚMERO\n");
			
		}
		
	}while(n!=0);
	
	system("PAUSE");
	
}
