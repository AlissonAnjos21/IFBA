<?php

$con = mysqli_connect("localhost", "root", "");
$sql = "CREATE DATABASE projetobloco2";

mysqli_query($con, $sql);
