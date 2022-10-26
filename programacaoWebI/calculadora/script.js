var Accum = 0;
var FlagNewNum = false;
var PendingOp = "";

function numero(Num){
    
    if (FlagNewNum){
        
			document.cal.tela.value  = Num;
			FlagNewNum = false;
        
   		}else if(document.cal.tela.value == "0"){
            
				document.cal.tela.value = Num;
    
			}else{
                
				document.cal.tela.value += Num;
    
   		}
    
}

function tipoOperacao(Op){
    
    if(document.cal.tela.value == ""){
        
			document.cal.tela.value ="0";
        
    }else if(FlagNewNum && PendingOp != "="){
        
        }else{
            
				FlagNewNum = true;
            
            }if( '+' == PendingOp ){
                    
					Accum += parseFloat(document.cal.tela.value);
            
					}else if( '-' == PendingOp ){
                        
					Accum -= parseFloat(document.cal.tela.value);
            
					}else if( '/' == PendingOp ){
                        
					Accum /= parseFloat(document.cal.tela.value);
            
                    }else if( '*' == PendingOp ){
                        
					Accum *= parseFloat(document.cal.tela.value);
            
				}else{
                    
					Accum = parseFloat(document.cal.tela.value);
                    
                        }
    
					document.cal.tela.value = Accum;
					PendingOp = Op;
			}
    
