#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

float delta(float a, float b, float c){
	
	return pow(b,2) - 4*a*c;
	
}

float raiz(float a, float b, float d, char sinal){
	
	return (-b + sqrt(d))/2*a;
	
}

float raiz2(float a, float b, float d, char sinal){
	
	return (-b - sqrt(d))/2*a;
	
}

main(){
	
	setlocale(LC_ALL,"");
	
	float a, b, c, d;
	
	printf("Informe os coeficientes: \n");
	      scanf("%f %f %f", &a, &b, &c);
	      
	d = delta(a,b,c);
	      
	if(d>= 0){
		
		printf("X1 = %.1f e X2 = %.1f", raiz(a,b,c,d), raiz2(a,b,c,d));
		
	}else{
		
		printf("Não há raiz real\n");
		
	}
	
	system("PAUSE");
	
}
