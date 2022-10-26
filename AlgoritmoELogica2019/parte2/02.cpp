#include <stdio.h>
#include <stdlib.h>

main(){
	
	int dia, mes, ano;
	
	printf("Informe o dia, mês e ano: \n");
	      scanf("%d %d %d", &dia, &mes, &ano);
	      
	      if(dia % 2 == 0 && dia <= 31 && mes % 2 == 0 && mes <= 12 && ano % 4 == 0){
	      	
	      	printf("Data válida!!!\n");
	      	
		  }else{
		  	
		  	printf("Data inválida!!!\n");
		  	
		  }
	
	system("PAUSE");

}
