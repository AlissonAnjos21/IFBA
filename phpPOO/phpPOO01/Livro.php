<?php

class Livro{

    public $titulo;
    public $ano;

    public function __construct($titulo, $ano){
        echo "OBJETO LIVRO FOI CRIADO<br>";
        $this->titulo = $titulo;
        $this->ano = $ano;

    }

    public function __destruct(){
        echo "<br>OBJETO LIVRO FOI DESTRUIDO<br>";

    }

    public function imprimir(){
        echo "$this->titulo, $this->ano<br>";

    }

}
