#include <stdio.h>
#include <stdlib.h>

main(){
	
	float num;
	
	printf("Informe um número: \n");
	      scanf("%f", &num);
	      
	if((num > 20) && (num < 90)){
	
	printf("O número %f está entre 20 e 90\n", num);
	
	}else{
		
		printf("O número %f não está entre 20 e 90\n", num);
		
	}
	
	system("PAUSE");
	
}
