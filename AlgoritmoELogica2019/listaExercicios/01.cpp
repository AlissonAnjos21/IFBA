#include <stdio.h>
#include <stdlib.h>


main(){
	
	int num;
	
	printf ("Informe um n�mero: ");
	      scanf ("%d", &num);
	      
	if(num > 10){
	  printf("%d � maior que 10\n", num);
	}

    else{
    	printf("%d � menor que 10\n", num);
	}
	
	system("PAUSE");
}
