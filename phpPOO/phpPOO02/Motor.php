<?php

/* Encapsulamento
        - Modificadores de Acesso
            - Public -> Qualquer Arquivo ou objeto pode acessar os atributos e métodos que estão com este modificador de acesso.
            - Private -> Apenas elementos internos da classe (métodos) podem acessar os atributos e métodos privados.
            - Protected -> Apenas elementos internos e elementos pertencentes a Classes filhas (herdam da classe com o atributo e método protegido) podem acessar.
*/

class Motor{

    protected $ligado;
    public $tipo;
    private $quantCombustivel;

    public function __construct($tipo){
        $this->tipo = $tipo;

    }

    public function ligar(){

        if($this->tipo == "1.0"){
            $quant = 1;
        }else if($this->tipo == "2.0"){
            $quant = 2;
        }else{
            $quant = 3;
        }

        $this->ligado = true;
        $this->quantCombustivel = $quant;

        echo "O CARRO FOI LIGADO COM $this->quantCombustivel litro(s) de combustível<br>";

    }

}

class MotorAlcool extends Motor{

    public function aquecer(){
        $this->ligado = true;
        echo "O Carro foi Ligado para aquecer<br>";

    }

}

$m1 = new Motor("1.0");
//$m1->tipo = "1.0";
//$m1->ligado = true;
//$m1->quantCombustivel = 3;
$m1->ligar();
