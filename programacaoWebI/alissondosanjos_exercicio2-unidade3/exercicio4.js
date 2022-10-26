let nota = 0, soma = 0, media = 0, cont = 0;

do{
    
    nota = parseFloat(prompt("Informe a nota: "));
    
    soma += nota;
    
    cont++;
    
}while(nota > 0);

soma -= nota;
cont--;
media = soma / cont;

document.write("A quantidade de notas foi: "+cont+"<br>A média das notas foi: "+media);