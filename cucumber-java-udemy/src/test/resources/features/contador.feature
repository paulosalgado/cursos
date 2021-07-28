# language: pt

Funcionalidade: Contador

  Cenário: Deve incrementar contador em 3
    Dado que o valor do contador é 15
    Quando eu incrementar em 3
    Então o valor do contador será 18

  Cenário: Deve incrementar contador em 35
    Dado que o valor do contador é 123
    Quando eu incrementar em 35
    Então o valor do contador será 158
