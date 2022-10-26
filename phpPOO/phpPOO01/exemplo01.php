<?php

/*
-> Objetos reais -> Concretos ou Abstratos -> Elementos de Software
-> Classe -> Um planejamento de como os Objetos irão ser representados
    -> Planta da casa -> Caracteristicas e Ações


    -> CARRO -> Classe Carro
                Atributos (Características)
                    -> Marca
                    -> Modelo
                    -> Quilometragem
                    -> Cor
                Metodos (Ações)
                    -> Andar -> Uma quantidade de Km
                    -> Parar -> Frear

-> Objeto é a instância da Classe -> Transforma o que foi planejado em algo real

                Estado
                    Marca -> Volks
                    Modelo -> Fusca
                    Quilometragem -> 150

*/

require_once "Carro.php";

$c1 = new Carro("Fusca", "Volksvagem");
//$c1 -> modelo = "Fusca";
//$c1 -> marca = "Volksvagem";
$c1 -> quilometragem = 0;
$c1 -> cor = 'Azul';
$c1 -> parado = true;

$c1 -> andar(10);
$c1-> parar();
$c1 -> andar(20);

$c2 = new Carro("Elba", "Fiat");
//$c2 -> modelo = "Elba";
//$c2 -> marca = "Fiat";
$c2 -> quilometragem = 100;
$c2 -> cor = "Amarelo";
$c2 -> parado = true;

$c2 -> andar(35);
$c2->parar();

echo "<pre>";
var_dump($c1);
var_dump($c2);
