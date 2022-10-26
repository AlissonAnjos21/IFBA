#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
	
	setlocale(LC_ALL,"");
	int A[5][4];
	
	//Preencher a matriz
	
	for(int i = 0; i < 5; i++){
		for(int j = 0; j < 4; j++){
			
			printf("Informe um elemento da matriz: \n");
			      scanf("%d", &A[i][j]);
			
		}
		
		//Mostra a matriz
		
		for(int i = 0; i < 5; i++){
			
			printf("\n");
			
			for(int j = 0; j < 4; j++){
				
				printf("%d ", A[i][j]);
				
			}
			
		}
		
	}

	system("PAUSE");
	
}
