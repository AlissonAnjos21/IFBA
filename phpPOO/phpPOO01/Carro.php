<?php

class Carro{
    /* Atributos */

    public $modelo;
    public $marca;
    public $cor;
    /* Atribuindo um valor padrão a um atributo */
    public  $quilometragem = 0;
    public $parado = true;

    /* Método -> Ações que irá realizar com o objeto */

    public function __construct($modelo, $marca){
        $this->modelo = $modelo;
        $this->marca = $marca;

    }


    public function andar($km){

        if($this->parado == true){
        echo "CARRO $this->modelo ANDANDO $km km!<br>";

        /* Representa a Instância atual (objeto) que está sendo executado */
        $this -> quilometragem = $this -> quilometragem + $km;
        $this->parado = false;

        }else{
            echo "CARRO $this->modelo já está em movimento e não pode andar<br>";
        }
    }

    public function parar(){
        echo "CARRO $this->modelo parou!<br>";
        $this->parado = true;

    }

}
