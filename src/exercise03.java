// Classe LivroDeLivraria
INICIO CLASSE LivroDeLivraria
    VARIÁVEIS:
        titulo: TEXTO
        autor: TEXTO
        anoPublicacao: INTEIRO
        numeroPaginas: INTEIRO
        editora: TEXTO
        preco: REAL
        estoque: INTEIRO

    // Criar Livro de Livraria
    INICIO FUNÇÃO CriarLivroDeLivraria(t: TEXTO, a: TEXTO, ano: INTEIRO, pag: INTEIRO, e: TEXTO, p: REAL, est: INTEIRO)
        titulo ← t
        autor ← a
        anoPublicacao ← ano
        numeroPaginas ← pag
        editora ← e
        preco ← p
        estoque ← est
    FIM FUNÇÃO

    // Exibir Informações do Livro
    INICIO FUNÇÃO ExibirDetalhes()
        ESCREVER "Título: ", titulo
        ESCREVER "Autor: ", autor
        ESCREVER "Ano de Publicação: ", anoPublicacao
        ESCREVER "Número de Páginas: ", numeroPaginas
        ESCREVER "Editora: ", editora
        ESCREVER "Preço: R$ ", preco
        ESCREVER "Estoque disponível: ", estoque
    FIM FUNÇÃO

    // Atualizar Estoque
    INICIO FUNÇÃO AtualizarEstoque(qtd: INTEIRO)
        estoque ← estoque + qtd
        ESCREVER "Novo estoque: ", estoque
    FIM FUNÇÃO
FIM CLASSE

// Programa Principal
INICIO PROGRAMA
    livro1 ← CriarLivroDeLivraria("A Viagem do Tigre", "Colleen Houck", 2012, 432, "Editora Arqueiro", 59.90, 10)

    ExibirDetalhes(livro1)
    AtualizarEstoque(livro1, 5) // Adicionando 5 livros ao estoque
FIM PROGRAMA
