#include <stdio.h>
#include <stdlib.h>

main(){
	
	int i, n, maior;
	
	for(i = 0; i < 20; i++){
		
		printf ("Informe um n�mero: \n");
		      scanf("%d",&n);

		if(n > maior){
			
			maior = n;
			
		}
		
	}
	
	printf("O maior n�mero lido foi %d\n", maior);
	
	system("PAUSE	");
	
}
