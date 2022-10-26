function valorPagamento(val, dia){
    
    let pago;
    
    if(dia == 0){
        
       pago = val - (val * (5/100)); 
        
    }else{
        
        pago = (sal * (3/100)) + ((salario * (0.5/100)) * dia);
        
    }
    
    return pago;
    
}

let v = parseFloat(prompt("Informe o valor da prestação: "));
let d = parseInt(prompt("Informe os dias de atraso: "));

let retorno = valorPagamento(v, d);

document.write("O valor total a ser pago é: "+retorno+"R$");