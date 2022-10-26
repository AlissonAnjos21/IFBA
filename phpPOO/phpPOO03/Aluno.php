<?php

/*
    Uma classe abstrata (abstract) é uma classe que é usada apenas como base para classes que a extendam (ou herdem dela), esse tipo de classe não pode ser instanciada diretamente (criar objetos a partir dela).
*/

abstract class Aluno{

    protected $nome;
    protected $idade;
    protected $curso;


    /*
        Métodos abstratos funciona como um contrato e só pode ser criado em classes abstratas, o método abstrato só tras a assinatura e serve como um contrato para que as classes que extendam esta classe sejam obrigados a implementar.
    */

    abstract public function matricular();

    public function imprimirDados(){
        echo "<h3>{$this->nome} -> {$this->curso}</h3>";

    }


    public function getNome(){
        return $this->nome;
    }

    public function getIdade(){
        return $this->idade;
    }

    public function getCurso(){
        return $this->curso;
    }

    public function setNome($nome){
        $this->nome = $nome;
    }

    public function setIdade($idade){
        $this->idade = $idade;
    }

    public function setCurso($curso){
        $this->curso = $curso;
    }

}