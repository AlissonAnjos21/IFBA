<?php

require_once "Aluno.php";

class AlunoSubsequente extends Aluno{

    protected $numeroMatricula = 1234;

    public function matricular(){
        echo "<h5>Matriculado no Subsequente</h5>";

    }

    /*
        Sobrecarga de Métodos -> não é aceita na linguagem PHP, pois o PHP é uma linguagem com tipagem fraca e dinâmica 
    */

    public function chamada(...$parametro){
        
        if(gettype($parametro[0]) == "string"){
            echo "<h5>CHAMADA PELO NOME</h5>";
        }else if(gettype($parametro[0]) == "integer"){
            echo "<h5>CHAMADA PELA MATRÍCULA</h5>";
        }
        
    }

}