#include <stdlib.h>
#include <stdio.h>

int main(){
	
    int n1, n2, resto;
    
    do {
    
	    printf("Informe um numeral:\n>");
	    scanf ("%d", &n1);
	    
	    printf ("Informe outro numeral:\n>");
	    scanf ("%d", &n2);
	    
	    if (n2>n1){
	    	
	    	resto = n1;
	    	n1    = n2;
	    	n2    = resto;
	    	resto = 0;
	    	
		}
		
		if (n2!=0)
		resto = n1%n2;
	    
	    while(resto!=0){
	    	
	        n1    = n2;
	        n2    = resto;
	        resto = n1%n2;
	        
	    }
	    printf ("O MDC dos números informados é %d\n\n", n2);
    
	} while (n1!=0 || n2!=0);
	
	system("PAUSE");
	
}
