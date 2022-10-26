#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main(){
	
	char senha[11];
	
	printf("Informe a senha: ");
	      scanf("%s", senha);
	
	if(strcmp(senha, "batatafrita") == 0){
	  printf ("Acesso permitido");
	}
	
	else{
		printf ("Você não tem acesso ao sistema\n");
	}

system("PAUSE");
	
}
