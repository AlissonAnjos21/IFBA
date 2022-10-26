#include <stdio.h>
#include <stdlib.h>

main(){
	
	char nome[20];
    double notas, soma, media;
	int faltas, i;
	
    printf("Informe o nome do aluno: ");
	      scanf("%s", &nome);
	
	for(i=1; i<=3; i++){
		
	printf("Informe a  nota %d: ",i);
	      scanf("%lf", &notas);
	           soma += notas;
		
	}
	
	printf("Informe a quantidade de faltas de %s: ",nome);
	      scanf("%d", &faltas);
	           media = soma/3;
	           
	if(faltas > 20){
		
	printf("REPROVADO POR FALTA\n");
		
	}else{
		
	if(media >= 7){
		
		printf("APROVADO\n");
		
	}else{
		
		printf("REPROVADO POR MÉDIA\n");
		
	}	
		
	   }
	      
    system("PAUSE");
	
}
