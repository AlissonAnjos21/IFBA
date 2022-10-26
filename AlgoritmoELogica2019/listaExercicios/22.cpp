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

printf("Seu IMC é: %lf\n",imc);

if(imc < 18.5){
	
	printf("Sua condição é: ABAIXO DO PESO\n");
	
}else{
	
	if(imc >= 18.5 && imc < 25){
		
		printf("Sua condição é: PESO NORMAL\n");
		
	}else{
		
		if(imc >= 25 && imc < 30){
			
			printf("Sua condição é: ACIMA DO PESO\n");
			
		}else{
			
			printf("Sua condição é: OBESO\n");
			
		}
		
	}
	
}	
	
	
	system("PAUSE");
	
}
