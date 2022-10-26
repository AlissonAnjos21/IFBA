#include <stdio.h>
#include <stdlib.h>

main(){
	
	int n, i;
	double fat = 1;
	
	printf("Informe um número: \n");
	      scanf("%d", &n);
	      
	for(i = n; i > 0; i --){
		
		fat *= i;
		
	}
	
	printf("Fat(%d) = %.0lf\n", n, fat);
	
	system("PAUSE");
	
}
