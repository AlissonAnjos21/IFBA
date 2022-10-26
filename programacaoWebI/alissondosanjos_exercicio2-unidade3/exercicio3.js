let base, expoente, cont = 1, resultado = 0;

base = parseInt(prompt("Informe a base: "));
expoente = parseInt(prompt("Informe o expoente: "));

resultado = base;

if(expoente != 0){

while(cont < expoente){
    
    resultado *= base;
    cont++
    
}

}else{
    
    resultado = 1;
    
}

document.write(base+"<sup>"+expoente+"</sup> = "+resultado);