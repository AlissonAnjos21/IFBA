#include <stdio.h>
#include <stdlib.h>

main(){
	
	int i, mc, du;
	
	for(i = 1000; i <= 9999; i++){
		
		mc = i / 100;
		  du = i % 100;
		    du += mc;
		
	if(i == du * du){
		
		printf("%d\n",i);
		
	}
		
	}
	
	system("PAUSE");
	
}
