<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário de Cadastro</title>
</head>
<body>
    
    <form action="receber03.php" method="post">
        
        <div>
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome">
        </div>

        <div>
        <label>Idade:
        <input type="number" name="idade" min="0" value="17" step="1">
        </label>
        </div>

        <div>
        <label>Data de Nascimento:
        <input type="date" name="nascimento">
        </label>
        </div>

        <div>
        <label>E-mail:
        <input type="email" name="email" placeholder="Coloque o seu melhor email">
        </label>
        </div>

        <div>
        <fieldset>

        <legend>Sexo:</legend>

        <label>
        <input type="radio" name="sexo" value="Masculino">
        Masculino
        <input type="radio" name="sexo" value="Feminino" checked>
        Feminino
        </label>
        </fieldset>
        </div>

        <div>
            <label for="curso">Curso:</label>
            <select name="curso" id="curso">
            <option value="Informática">Informática</option>
            <option value="Edficações">Edficações</option>
            <option selected>Escolha seu Curso</option>

        </div>

        <div>

        <fieldset>

        <legend>Disciplinas:</legend>

            <label> <input type="checkbox" name="disciplinas[]" value="Matemática">
            Matemática
            </label>
            <label> <input type="checkbox" name="disciplinas[]" value="Português">
            Português
            </label>
            <label> <input type="checkbox" name="disciplinas[]" value="História">
            História
            </label>
            <label> <input type="checkbox" name="disciplinas[]" value="Geografia">
            Geografia
            </label>
        
        </fieldset>

        </div>

        <div>
        
        <label for="comentario">Comentário</label> <br>
        <textarea name="comentario "id="comentario">TEXTO PADRÃO</textarea>
        
        </div>

    <button>Enviar</button>

    </form>

</body>
</html>