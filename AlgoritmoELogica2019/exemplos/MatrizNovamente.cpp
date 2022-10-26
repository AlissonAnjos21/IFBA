#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
	
	//ESTE PROGRAMA ESTA COM ERRO
	
	setlocale(LC_ALL,"");
	
	float vendas[12][4];
	float total_mes, total;
	
	for(int i = 0; i < 12; i++){
		
		for(int j = 0; j < 4; i++){
			
			printf("Informe as vendas da semana %d, do mês %d: \n", j+1, i+1);
				  scanf("%f", &vendas[i][j]);
			
		}
		
	}
	
	//Calcula as vendas por mês
	
	printf("\n\nTotal de vendas por mês");
	printf("\n Semana 1  Semana 2  Semana 3  Semana 4  Total do Mês\n");
	
	for(int i = 0; i < 12; i++){
		
		for(int j = 0; j < 4; j++){
			
			total_mes += vendas[i][j];	
			
		}
		
		printf("%.2f\n", i+1, total_mes);
		total_mes = 0;
		
	}
	
	printf("TOTAL: %2.f", total);
	
	system("PAUSE");
	
}
