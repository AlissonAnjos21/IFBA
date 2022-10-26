#include <stdio.h>
#include <stdlib.h>

main(){
	
	int a1, r, i;
	
	printf("Informe o primeiro termo e a razão da PA: \n");
	      scanf("%d %d", &a1, &r);
	      
	for(i = 0; i < 50; i++){
		
		printf("\n%d\n", a1);
		a1 += r;
		
	}
	
	system("PAUSE");
	
}

