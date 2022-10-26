let inicio, fim, pula;

inicio = parseInt(prompt("Informe o valor inicial: "));
fim = parseInt(prompt("Informe o valor final: "));
pula = parseInt(prompt("Informe a quantidade de números a serem pulados: "));

for(let i = inicio; i <= fim; i+= pula){
    
    document.write(i+" ");
    
}