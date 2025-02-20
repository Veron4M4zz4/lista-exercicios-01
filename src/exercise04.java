// Classe LivroDeBiblioteca
INICIO CLASSE LivroDeBiblioteca
    VARIÁVEIS:
        titulo: TEXTO
        autor: TEXTO
        anoPublicacao: INTEIRO
        numeroPaginas: INTEIRO
        editora: TEXTO
        disponivel: BOOLEANO
        leitorAtual: TEXTO

    // Criar Livro de Biblioteca
    INICIO FUNÇÃO CriarLivroDeBiblioteca(t: TEXTO, a: TEXTO, ano: INTEIRO, pag: INTEIRO, e: TEXTO)
        titulo ← t
        autor ← a
        anoPublicacao ← ano
        numeroPaginas ← pag
        editora ← e
        disponivel ← VERDADEIRO
        leitorAtual ← ""
    FIM FUNÇÃO

    // Exibir Informações do Livro
    INICIO FUNÇÃO ExibirDetalhes()
        ESCREVER "Título: ", titulo
        ESCREVER "Autor: ", autor
        ESCREVER "Ano de Publicação: ", anoPublicacao
        ESCREVER "Número de Páginas: ", numeroPaginas
        ESCREVER "Editora: ", editora
        SE disponivel ENTAO
            ESCREVER "Status: Disponível para empréstimo"
        SENAO
            ESCREVER "Status: Emprestado para ", leitorAtual
        FIM SE
    FIM FUNÇÃO

    // Emprestar Livro
    INICIO FUNÇÃO EmprestarLivro(nomeLeitor: TEXTO)
        SE disponivel ENTAO
            disponivel ← FALSO
            leitorAtual ← nomeLeitor
            ESCREVER "Livro emprestado para ", nomeLeitor
        SENAO
            ESCREVER "Livro já está emprestado para ", leitorAtual
        FIM SE
    FIM FUNÇÃO

    // Devolver Livro
    INICIO FUNÇÃO DevolverLivro()
        SE disponivel = FALSO ENTAO
            disponivel ← VERDADEIRO
            ESCREVER "Livro devolvido por ", leitorAtual
            leitorAtual ← ""
        SENAO
            ESCREVER "Este livro já está disponível na biblioteca"
        FIM SE
    FIM FUNÇÃO
FIM CLASSE

// Programa Principal
INICIO PROGRAMA
    livro1 ← CriarLivroDeBiblioteca("A Viagem do Tigre", "Colleen Houck", 2012, 432, "Editora Arqueiro")

    ExibirDetalhes(livro1)
    EmprestarLivro(livro1, "Verona Amoêdo")
    ExibirDetalhes(livro1)
    DevolverLivro(livro1)
    ExibirDetalhes(livro1)
FIM PROGRAMA
