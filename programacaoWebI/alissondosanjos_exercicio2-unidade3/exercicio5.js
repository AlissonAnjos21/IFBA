let votacao = 0, num1 =0 , num2 = 0, num3 = 0, num4 = 0, num5 = 0, parar = 0;

do{
    
    votacao = parseInt(prompt("Votação sobre a atuação do presidente: \nVote 1 para Exelente\nVote 2 para Boa\nVote 3 para Regular\nVote 4 para Ruim\nVote 5 para Péssimo\nUse o 6 para mostrar o resultado parcial da votação\nUse qualquer outro valor para mostrar o resultado final da votação"));
    
    switch(votacao){
            
        case 1:
            
            num1++;
            
            break;
            
        case 2:
            
            num2++;
            
            break;
            
        case 3:
            
            num3++;
            
            break;
            
        case 4:
            
            num4++;
            
            break;
            
        case 5:
            
            num5++;
            
            break;
            
        case 6:
            
            alert("Resultado Parcial:\nExelente: "+num1+"\nBoa: "+num2+"\nRegular: "+num3+"\nRuim: "+num4+"\nPessimo: "+num5);
            
            break;
            
        default:
            
            parar = 1;
            
    }
    
}while(parar != 1);

alert("Resultado Final:\nExelente: "+num1+"\nBoa: "+num2+"\nRegular: "+num3+"\nRuim: "+num4+"\nPessimo: "+num5);