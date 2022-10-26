#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
	
	setlocale(LC_ALL,"");
	
	 int num[10] = {};
	 
	 for(int i = 0; i < 10; i++){
	 
	 printf("Informe um números: \n");
	       scanf("%d", &num[i]);
	
	}
	
	for(int i = 0; i < 10; i++){
		
		printf("\nPosição: %d\nValor: %d\n\n", i,num[i]);
		
	}
	
	system("PAUSE");
	
}
