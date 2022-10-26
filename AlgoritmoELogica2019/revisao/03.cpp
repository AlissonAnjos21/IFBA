#include <stdio.h>
#include <stdlib.h>
#include <math.h>

main(){
	
	float a,b,c,x,y;
	
	printf("Informe os coeficientes: \n");
	      scanf("%f %f %f", &a, &b, &c);
	      
	do{
		
		printf("\n Informe um valor de x: \n");
		      scanf("%f", &x);
		      
        y = a * pow(x,2) + b * x + c;
        
        printf("\nf(%.lf) = %.1f", x, y);
		
	}while (x != 0);
	
	system("PAUSE");
	
}
