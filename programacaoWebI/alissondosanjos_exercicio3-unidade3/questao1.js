function reajuste(salario){
    
    let reajuste = salario;
    let aumento;
    let perc = 0;
    
    if(salario <= 280){
        
        aumento = (reajuste * (20/100));
        reajuste += aumento;
        perc = 20;
        
    }else if(salario > 280 && salario < 700){
        
        aumento = (reajuste * (15/100));
        reajuste += aumento;
        perc = 15;
        
    }else if(salario > 700 && salario < 1500){
        
        aumento = (reajuste * (10/100));
        reajuste += aumento;
        perc = 10;
        
    }else if(salario >= 1500){
        
        aumento = (reajuste * (5/100));
        reajuste += aumento;
        perc = 5;
        
    }
    
    
    
    document.write("Salário antes do reajuste: "+salario+"R$<br>Percentual de aumento aplicado: "+perc+"%<br>Valor do aumento: "+aumento+"R$<br>Novo salário: "+reajuste+"R$");
    
}

let s = parseFloat(prompt("Informe o valor do salário: "));
reajuste(s);