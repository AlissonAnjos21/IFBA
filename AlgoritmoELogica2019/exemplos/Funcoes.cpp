#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int maior(int n1, int n2){
	
	setlocale(LC_ALL,"");
	
	if(n1 > n2){
		
		return n1;
		
	}else{
		
		return n2;
		
	}
	
}

main(){
	
	setlocale(LC_ALL,"");
	
	int n1, n2;
	
	printf("Informe dois n�meros: \n");
	      scanf("%d %d", &n1, &n2);
	      
	printf("O maior n�mero �: %d", maior(n1,n2));
	
}
