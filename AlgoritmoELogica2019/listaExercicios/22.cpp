#include <stdio.h>
#include <stdlib.h>
#include <math.h>

main(){
	
double peso, altura, imc;	
	
printf("Informe o peso: ");
      scanf("%lf", &peso);
printf("Informe a altura: ");
      scanf("%lf", &altura);
	  
imc = peso / (pow(altura,2));

printf("Seu IMC �: %lf\n",imc);

if(imc < 18.5){
	
	printf("Sua condi��o �: ABAIXO DO PESO\n");
	
}else{
	
	if(imc >= 18.5 && imc < 25){
		
		printf("Sua condi��o �: PESO NORMAL\n");
		
	}else{
		
		if(imc >= 25 && imc < 30){
			
			printf("Sua condi��o �: ACIMA DO PESO\n");
			
		}else{
			
			printf("Sua condi��o �: OBESO\n");
			
		}
		
	}
	
}	
	
	
	system("PAUSE");
	
}
