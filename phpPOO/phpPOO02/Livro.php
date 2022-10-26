<?php

/*
    Métodos Mágicos -> Getters e Setters
 */

 class Livro{

    private $titulo;
    private $editora;
    private $ano;
    private $autor;

    public function __set($atributo, $valor){
        echo "Atributo: $atributo<br>";
        echo "Valor: $valor<br>";

        $this->$atributo = $valor;

    }

    public function __get($atributo){
        return $this->$atributo;

    }

 }

 $l1 = new Livro();
 $l1->titulo = "Senhor dos Aneis";
 $l1->editora = "Moderna";
 $l1->ano = 1970;
 $l1->autor = "Tolkien";

 echo "Titulo: $l1->titulo";

 echo "<hr>";
 var_dump($l1);
