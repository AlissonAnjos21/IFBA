<?php

class Pessoa{

    private $nome;
    protected $idade;
    private $cpf;

    public function __construct($nome, $idade, $cpf){
        $this->setNome($nome);
        $this->idade = $idade;
        $this->cpf = $cpf;

    }

    /* SETTERS -> SET -> Permite que você modifique ou adicione valor a atributos protegidos ou privados. */

    public function setNome($nome){
        if(strlen($nome) < 2){
            echo "ERRO! NOME COM MENOS DE DOIS CARACTERES<br>";
        }else{
            $this->nome = $nome;

        }
    }

    /* GETTERS -> GET -> Permite que você acesse ou leia o valor de atributos protegidos ou privados. */

    public function getNome(){
        // O strtoupper deixa tudo em maiúsculo
        return strtoupper($this->nome);

    }

}

$p1 = new Pessoa("Thiago", 37, 1234578);
//$p1->nome = "Thiago";
//$p1->idade = 37;
//$p1->cpf = 1234578;
//$p1->setNome("a");
$p1->setNome("Thiago Miranda");

echo $p1->getNome()."<br>";


