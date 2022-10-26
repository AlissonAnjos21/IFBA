<?php

$turno = filter_input(INPUT_POST, "turno");

switch($turno){

    case 'M':

        echo "<h1>Bom Dia</h1>";
        break;

    case 'V':

        echo "<h1>Boa Tarde</h1>";
        break;

    case 'N':

        echo "<h1>Boa Noite</h1>";
        break;

    default:

        echo "<h1>Você Não Informou o seu Turno</h1>";


}