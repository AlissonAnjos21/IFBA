let numero = new Array (21, 12, 2, 1, 212, 121, 210, 120, 201, 102);
console.log(numero);

numero.push(77);
console.log(numero);

numero.unshift(34);
console.log(numero);

let pos = numero.indexOf(212);
numero.splice(pos, 0, 987);
console.log(numero);

let imprime = (elemento) => document.write("<h2>"+elemento+"</h2>");

numero.forEach(imprime);

let filtroP = num => (num % 2) == 0;
let pares = numero.filter(filtroP);
console.log(pares);

let filtroI = num => (num % 2) != 0;
let impares = numero.filter(filtroI);
console.log(impares);


for(let valor of pares){
    
    document.write(valor+"<br>");
    
}


for(atributo in impares){
    
    document.write(atributo+": "+impares[atributo]+"<br>");
    
}

if(pares.every(n => (n%2) == 0)){
    
    console.log("TODOS OS ELEMENTOS SÃO PARES");
    
}else{
    
    console.log("NEM TODOS OS ELEMENTOS SÃO PARES");
    
}