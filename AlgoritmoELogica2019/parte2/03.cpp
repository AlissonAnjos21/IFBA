#include <stdio.h>
#include <stdlib.h>

main(){
	
	int num, pro = 1, soma = 0, i = 1;
	
	do{
		
	  printf("Informe um n�mero: \n");
	        scanf("%d", &num);
	        
	  if(num > 0 && num % 2 == 0){
	    soma += num;
	    
	 }
	  else{
	  	
		if(num > 0 && num % 2 != 0){
		  pro *= num;
		  
		}
	}
	
	  i = i + 1;
	  
	}
	
	while(num > 0);
	
	printf("\n A soma resultante dos n�meros pares �: %d\n", soma);
	      printf("\n O produto dos n�meros �mpares �: %d\n"), pro;
	
	system("PAUSE");
	
}
