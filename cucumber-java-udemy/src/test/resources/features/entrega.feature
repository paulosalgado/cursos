# language: pt

Funcionalidade: Entrega

  Cenário: Deve calcular atraso na entrega
    Dado que a entrega é dia 05/04/2018
    Quando a entrega atrasar em 2 dias
    Então a entrega será efetuada em 07/04/2018

  Cenário: Deve calcular atraso no prazo de entrega da China
    Dado que a entrega é dia 05/04/2018
    Quando a entrega atrasar em 2 meses
    Então a entrega será efetuada em 05/06/2018
