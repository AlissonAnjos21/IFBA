#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
	
	setlocale(LC_ALL,"");

		int M[3][4];
		
		//Ler a matriz
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				
			printf("Informe um número para a matriz: \n");
				  scanf("%d", &M);
				
			}
		
		}
		
		//Soma a segunda e a terceira
		
		int soma = 0;
		
		for(int j = 0; j < 4; j++){
			
			soma += M[1][j] + M[2][j];
			
		}
		
		printf("A soma é: %d\n", soma);

	system("PAUSE");
	
}
