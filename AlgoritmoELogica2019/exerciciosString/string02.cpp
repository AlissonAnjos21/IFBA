#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

main(){
	
	setlocale(LC_ALL, "");
	
	char texto[100]={};
	
	printf("Digite um valor númerico: \n");
		gets(texto);
		
		int tam;
		
		tam = strlen(texto);
		
		for(int i = 0; i <= tam; i++){
		
		switch(texto[i]){
			
			case '0':{
				
				printf("Zero\n");
				
				
				break;
			}
			
			case '1':{
				
				printf("Um\n");
				
	
				break;
			}
			
			case '2':{
				
				printf("Dois\n");
				
				
				break;
			}
			
			case '3':{
				
				printf("Três\n");
				
				
				break;
			}
			
			case '4':{
				
				printf("Quatro\n");
				
				
				break;
			}
			
			case '5':{
				
				printf("Cinco\n");
				
				
				break;
			}
			
			case '6':{
				
				printf("Seis\n");
				
				
				break;
			}
			
			case '7':{
				
				printf("Sete\n");
				
				
				break;
			}
			
			case '8':{
				
				printf("Oito\n");
				
				
				break;
			}
			
			case '9':{
				
				printf("Nove\n");
				
				
				break;
			}
			
			}
			
		}
	
	system("PAUSE");
	
}
