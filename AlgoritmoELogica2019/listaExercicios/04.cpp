#include <stdio.h>
#include <stdlib.h>

main(){
	
	float x, y, z;
	
	printf("Informe os lados do tri�ngulo: \n");
	      scanf("%f %f %", &x, &y, &z);
	      
	if ( (x < y + z) && (y < x + z) && (z < x + y) ){
	
	printf("Forma um tri�ngulo!\n");
	
	if( (x == y) && (y == z) ){
		
		printf("TRI�NGULO ESQUILATERO\n");
		
	}else{
		
		if( (x != y) && (x != z) && (y != z) ){
			
			printf("TRI�NGULO ESCALENO\n");
			
		}else{
			
			printf("TRI�NGULO ISOCELES\n");
			
		}
		
	}
	
	}else{
		
		printf("N�o forma um tri�ngulo!\n");
		
	}
	      
	
	
	system("PAUSE");
	
}
