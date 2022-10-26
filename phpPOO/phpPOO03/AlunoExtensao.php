<?php

require_once "Aluno.php";

class AlunoExtensao extends Aluno{

    protected $cpf;

    public function setCpf($cpf){
        $this->cpf = $cpf;
    }

    public function getCpf(){
        return $this->cpf;
    }

    public function matricular(){
        echo "<h5>Matriculado na Extensão</h5>";
        
    }

    public function imprimirDados(){
        /* parent -> referencia a classe PAI que está sendo herdada por esta classe, e ao utilizar o operador(::) podemos acessar métodos e atributos relacionados a esta classe pai. */
        parent::imprimirDados();
        echo "<p>CPF: {$this->cpf}</p>";

    }

}
