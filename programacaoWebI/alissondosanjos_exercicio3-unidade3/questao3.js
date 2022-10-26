function operacao(num){
    
    for(let i = 1; i <= num; i++) {
        
		for(let j = 0; j < i; j++) {
            
			document.write(i+" ");
		}
        
		document.write("<br>");
        
	}
    
}

let n = parseInt(prompt("Informe um número: "));
operacao(n);