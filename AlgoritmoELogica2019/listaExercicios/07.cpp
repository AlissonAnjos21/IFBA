#include <stdio.h>
#include <stdlib.h>
#include <math.h>

main(){

float a, b, c, delta, x1, x2;

printf ("Informe os coeficientes: ");
      scanf ("%f, %f, %f", &a, &b, &c);
	
delta = pow(b,2) - 4 * a * c;

if(delta > 0){
	
	printf ("Possui duas ra�zes diferentes\n");
	      x1 = (-b + sqrt(delta)) / (2 * a);
	      x2 = (-b - sqrt(delta)) / (2 * a);
	        printf("\nRa�zes: %f e %f", x1, x2);
	      
}else{
	if(delta == 0){
		
	printf("Possui duas ra�zes iguais\n");
	      x1 = -b / (2 * a);
	      x2 = -b / (2 * a);
	        printf("\nRa�zes: %f e %f", x1, x2);
	        
	}else{
		
		printf("N�o possui raiz real\n");
		
	}
}
		
system("PAUSE");	
	
}
