#include <stdio.h>
#include <stdlib.h>

main(){
	
	float compra, venda;
	
	printf("Informe o valor de compra do produto: \n");
	      scanf("%f", &compra);
	      
	if (compra < 20){
		
		venda = compra * 1.45;
		
	}else{
		
		venda = compra * 1.3;
		
	}
	
	printf("\nVALOR VENDA: %f\n", venda);
	
	system("PAUSE");
	
}
