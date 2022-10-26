let array = new Array ();

let num;
let i = 0;

do{

    num = parseFloat(prompt("Informe um número decimal: "));
    
    if(num != 0){
        
        array[i] = num;
        
    }
    
    i++;
    
    }while(num != 0);

console.log(array);

array = array.map( num => num -= 0.05);
console.log(array);

let imprime = (valor, j) => document.write("PRODUTO "+j+" - VALOR: R$ "+ valor+"<br>");

array.forEach(imprime);

document.write("<br>"+array.length+" produtos<br>");

let total = array.reduce( (acumulado, prox) => acumulado += prox, 0);
document.write("O total foi de: "+total+"<br>");

let pagamento = array.reduce( (acc = 100, prox) => prox -= acc, 0);

if(pagamento >= 0){
    
   document.write("VOCÊ PRECISA PAGAR AINDA: "+pagamento);
   
   }else{
       
    document.write("O SEU TROCO É DE: "+pagamento);
   
}
