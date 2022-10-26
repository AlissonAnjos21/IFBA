let somaImposto = function (cust, impo){
    
    return cust += (cust * (impo/100));
    
}

let custo = parseFloat(prompt("Informe o custo do produto: "));
let taxa = parseFloat(prompt("Informe a taxa de imposto: "));


let retorno = somaImposto(custo, taxa);

document.write("O valor final do produto é: "+retorno);