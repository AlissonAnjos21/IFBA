#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
	
	setlocale(LC_ALL,"");
	float M[3][4];
	float soma;
	float somac;
	
	//preencher a matriz
	
	for(int lin = 0; lin < 3; lin++){//Indica a linha atual
		for(int col = 0; col < 4; col++){//Indica a coluna atual
			
			printf("Informe o elemento (%d, %d): \n", lin,col);
			      scanf("%f", &M[lin][col]);
			
		}
		
	}
	
	//Soma os elementos da linha 2
	
	for(int col = 0; col < 4; col++){
		
		soma += M[2][col];
		
	}
	
	printf("A soma da linha 2 é: %1.lf \n", soma);
	
	//Soma os elementos da coluna 2
	
	for(int lin = 0; lin < 3; lin++){
	somac += M[lin][2];
	
	}
	
	printf("A soma da coluna 2 é: %1.lf \n", somac);
	
	system("PAUSE");
	
}
