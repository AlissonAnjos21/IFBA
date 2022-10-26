#include <stdio.h>
#include <stdlib.h>

main(){
	
	setlocale(LC_ALL, "Portuguese");
	
	int v1, v2, v3;
	float media;

	printf("Informe o primeiro valor: \n");
	      scanf("%d", &v1);
	      
	printf("Informe o segundo valor: \n");
	      scanf("%d", &v2);
	                 
	printf("Informe o terceiro valor: \n");
	      scanf("%d", &v3);
	      
    media = v1 + v2 + v3, media /= 3;
	                                
	printf("A media dos valores e: %f\n",media);
	                                
	system("PAUSE");
	
}
