let altura, maior = 0, menor = 0, media, soma = 0, cont = 0;

while(cont < 15){

altura = parseFloat(prompt("Informe a altura: "));
    
    if(altura > maior){
        
        maior = altura;
        
    }else{
        
        menor = altura;
        
    }
    
    if(menor > maior){
        
        maior = menor;
        
    }
    
soma += altura;
    
cont++;
    
}

media = soma / cont;

document.write("A menor altura do grupo é: "+menor+"<br>A maior altura do grupo é: "+maior+"<br>A média de altura do grupo é: "+media);

