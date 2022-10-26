let tabuada = function(num){
    
    for(let i = 1; i <= 10; i++){
        
        let result = num * i;
        
        document.write(num+" X "+i+" = "+result+"<br>");
        
    }
    
}

let n;

do{
    
n = parseInt(prompt("Informe um número de 1 à 10: "));

}while(n < 1 || n > 10);

tabuada(n);