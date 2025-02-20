// Classe Mesa
INICIO CLASSE Mesa
    VARIÁVEIS:
        numeroMesa: INTEIRO
        quantidadePessoas: INTEIRO
        totalConta: REAL

    // Criar Mesa
    INICIO FUNÇÃO CriarMesa(numero: INTEIRO, pessoas: INTEIRO)
        numeroMesa ← numero
        quantidadePessoas ← pessoas
        totalConta ← 0
    FIM FUNÇÃO

    // Adicionar Pessoas
    INICIO FUNÇÃO AdicionarPessoa(qtd: INTEIRO)
        quantidadePessoas ← quantidadePessoas + qtd
    FIM FUNÇÃO

    // Adicionar Item ao Pedido
    INICIO FUNÇÃO AdicionarItem(tipo: TEXTO, qtd: REAL)
        PRECO ← 0
        SE tipo = "comida" ENTAO PRECO ← 30
        SE tipo = "sobremesa" ENTAO PRECO ← 6
        SE tipo = "refrigerante" ENTAO PRECO ← 5
        SE tipo = "cerveja" ENTAO PRECO ← 10
        totalConta ← totalConta + (qtd * PRECO)
    FIM FUNÇÃO

    // Fechar Conta
    INICIO FUNÇÃO FecharConta()
        SE quantidadePessoas > 0 ENTAO
            ESCREVER "Total: R$ ", totalConta
            ESCREVER "Por pessoa: R$ ", totalConta / quantidadePessoas
        SENAO
            ESCREVER "Nenhuma pessoa na mesa!"
        FIM SE
    FIM FUNÇÃO

    // Nota Fiscal
    INICIO FUNÇÃO EmitirNotaFiscal()
        ESCREVER "--- Nota Fiscal ---"
        ESCREVER "Mesa: ", numeroMesa
        ESCREVER "Total: R$ ", totalConta
        ESCREVER "Por pessoa: R$ ", totalConta / quantidadePessoas
        ESCREVER "--------------------"
    FIM FUNÇÃO
FIM CLASSE

// Programa Principal
INICIO PROGRAMA
    mesa1 ← CriarMesa(1, 3)

    AdicionarItem(mesa1, "comida", 2.5) 
    AdicionarItem(mesa1, "sobremesa", 2)
    AdicionarItem(mesa1, "refrigerante", 3)
    AdicionarItem(mesa1, "cerveja", 4)

    FecharConta(mesa1)
    EmitirNotaFiscal(mesa1)
FIM DO MEU PROGRAMA
