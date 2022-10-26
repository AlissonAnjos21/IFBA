#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

main(){
	
	setlocale(LC_ALL, "");
	
	char texto[100]={};
	
	printf("Digite um texto: \n");
		gets(texto);
		
		printf("A quantidade de caracteres é: %d\n",strlen(texto));
	
	system("PAUSE");
	
}
