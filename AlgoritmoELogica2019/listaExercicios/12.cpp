#include <stdio.h>
#include <stdlib.h>

main(){
	
	float num;
	
	printf("Informe um n�mero: \n");
	      scanf("%f", &num);
	      
	if((num > 20) && (num < 90)){
	
	printf("O n�mero %f est� entre 20 e 90\n", num);
	
	}else{
		
		printf("O n�mero %f n�o est� entre 20 e 90\n", num);
		
	}
	
	system("PAUSE");
	
}
