#include <stdio.h>
#include <stdlib.h>

main(){
	
	float altura, peso;
	char sexo;
	
	printf("Informe o sexo: ");
	      scanf("%c", &sexo);
	printf("Informe a altura: ");
	      scanf("%f", &altura);
	      
    switch(sexo){
    	
    	case('m'):{
    		peso = (72.7 * altura) - 58;
    		    printf("Seu peso ideal é: %f\n", peso);
			break;
		}
		
        case('f'):{
        	peso = (62.1 * altura) - 44.7;
        	    printf("Seu peso ideal é: %f\n", peso);
			break;
		}
        
    default:{
    	printf("ERRO!!!   SEXO INVÁLIDO\n");
		break;
	}
    
	}
	
	system("PAUSE");
	
}

