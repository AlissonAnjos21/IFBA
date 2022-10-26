#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
	
	setlocale(LC_ALL,"");
	
	int A[4][4];
	
	//Ler a matriz
	
	for(int i = 0; i < 4;i++){
		for(int j = 0; j < 4; j++){
			
			printf("Informe um elemento da matriz: \n");
			      scanf("%d", &A[i][j]);
			
		}	
					
	}
	
	//Mostra a diagonal principal
	
	for(int i = 0; i < 4; i++){
		
		printf("\n%d\n", A[i][i]);
		
	}
	
	system("PAUSE");
	
}
