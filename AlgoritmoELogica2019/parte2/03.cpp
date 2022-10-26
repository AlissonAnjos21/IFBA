#include <stdio.h>
#include <stdlib.h>

main(){
	
	int num, pro = 1, soma = 0, i = 1;
	
	do{
		
	  printf("Informe um número: \n");
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
	
	printf("\n A soma resultante dos números pares é: %d\n", soma);
	      printf("\n O produto dos números ímpares é: %d\n"), pro;
	
	system("PAUSE");
	
}
