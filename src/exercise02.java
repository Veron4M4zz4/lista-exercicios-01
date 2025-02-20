// Classe Livro
INICIO CLASSE Livro
    VARIÁVEIS:
        titulo: TEXTO
        autor: TEXTO
        anoPublicacao: INTEIRO
        numeroPaginas: INTEIRO
        editora: TEXTO

    // Criar Livro
    INICIO FUNÇÃO CriarLivro(t: TEXTO, a: TEXTO, ano: INTEIRO, pag: INTEIRO, e: TEXTO)
        titulo ← t
        autor ← a
        anoPublicacao ← ano
        numeroPaginas ← pag
        editora ← e
    FIM FUNÇÃO

    // Exibir Informações do Livro
    INICIO FUNÇÃO ExibirDetalhes()
        ESCREVER "Título: ", titulo
        ESCREVER "Autor: ", autor
        ESCREVER "Ano de Publicação: ", anoPublicacao
        ESCREVER "Número de Páginas: ", numeroPaginas
        ESCREVER "Editora: ", editora
    FIM FUNÇÃO
FIM CLASSE

// Programa Principal
INICIO PROGRAMA
    livro1 ← CriarLivro("A Viagem do Tigre", "Colleen Houck", 2012, 432, "Editora Arqueiro")

    ExibirDetalhes(livro1)
FIM PROGRAMA

