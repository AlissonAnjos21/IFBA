#include <stdio.h>
#include <stdlib.h>

main(){
	
	float x, y, z;
	
	printf("Informe os lados do triângulo: \n");
	      scanf("%f %f %", &x, &y, &z);
	      
	if ( (x < y + z) && (y < x + z) && (z < x + y) ){
	
	printf("Forma um triângulo!\n");
	
	if( (x == y) && (y == z) ){
		
		printf("TRIÂNGULO ESQUILATERO\n");
		
	}else{
		
		if( (x != y) && (x != z) && (y != z) ){
			
			printf("TRIÂNGULO ESCALENO\n");
			
		}else{
			
			printf("TRIÂNGULO ISOCELES\n");
			
		}
		
	}
	
	}else{
		
		printf("Não forma um triângulo!\n");
		
	}
	      
	
	
	system("PAUSE");
	
}
