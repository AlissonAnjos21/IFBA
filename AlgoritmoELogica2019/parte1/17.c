#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
main(){
    setlocale(LC_ALL,"Portuguese");
    
	unsigned int n1, n2, aux, aux2, aux3;
	int i = 0, j = 0, teste = 1, soma1 = 0, soma2 = 0;
	
	printf ("Informe um número: \n");
	      scanf("%d", &n1);
	      
	printf ("Informe outro número: \n");
	      scanf("%d", &n2);
	
	if(n1 < n2){
		aux = n1;
		n1  = n2;
		n2  = aux;
	}
	
	aux = n1;
	aux3 = n2;
	
	while(aux != 0){
		soma1 += aux%10;
		soma2 += aux3%10;
		aux   /= 10;
		aux3  /= 10;
		i++;
	} 
	
	while(n1 != 0){
		aux   = n1%10;
		n1   /= 10;
		aux3  = n2;
		teste = 1;
		for(j = 0; j < i; j++){
			aux2   = aux3%10;
			aux3  /= 10;
		if(aux == aux2)
			teste = 0;
		}
	
		if(teste || soma1!=soma2){
			
			printf("Não é permutação\n\n");
			system("PAUSE");
			return 0;
		}
	}
	
	printf("É permutação\n\n"); 
	
	system("PAUSE");

}
