#include <stdio.h>
#include <stdlib.h>


main(){
	
	int num;
	
	printf ("Informe um número: ");
	      scanf ("%d", &num);
	      
	if(num > 10){
	  printf("%d é maior que 10\n", num);
	}

    else{
    	printf("%d é menor que 10\n", num);
	}
	
	system("PAUSE");
}
