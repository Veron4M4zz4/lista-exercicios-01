// Classe ContaBancaria
INICIO CLASSE ContaBancaria
    VARIÁVEIS:
        titular: TEXTO
        numeroConta: INTEIRO
        saldo: REAL

    // Criar Conta Bancária
    INICIO FUNÇÃO AbrirConta(t: TEXTO, n: INTEIRO, s: REAL)
        titular ← t
        numeroConta ← n
        saldo ← s
    FIM FUNÇÃO

    // Exibir Saldo
    INICIO FUNÇÃO EmitirSaldo()
        ESCREVER "Titular: ", titular
        ESCREVER "Número da Conta: ", numeroConta
        ESCREVER "Saldo disponível: R$ ", saldo
    FIM FUNÇÃO

    // Depositar Valor na Conta
    INICIO FUNÇÃO Depositar(valor: REAL)
        SE valor > 0 ENTAO
            saldo ← saldo + valor
            ESCREVER "Depósito de R$ ", valor, " realizado com sucesso!"
        SENAO
            ESCREVER "Valor inválido para depósito!"
        FIM SE
    FIM FUNÇÃO

    // Retirar Valor da Conta
    INICIO FUNÇÃO Retirar(valor: REAL)
        SE valor > 0 E saldo >= valor ENTAO
            saldo ← saldo - valor
            ESCREVER "Saque de R$ ", valor, " realizado com sucesso!"
        SENAO
            ESCREVER "Saldo insuficiente ou valor inválido!"
        FIM SE
    FIM FUNÇÃO
FIM CLASSE

// Programa Principal
INICIO PROGRAMA
    conta1 ← AbrirConta("Verona Amoêdo", 12345, 1000.00)

    EmitirSaldo(conta1)
    Depositar(conta1, 500)
    EmitirSaldo(conta1)
    Retirar(conta1, 200)
    EmitirSaldo(conta1)
FIM PROGRAMA
