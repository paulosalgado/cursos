print("*********************************")
print("Bem vindo no jogo de Adivinhação!")
print("*********************************")

numero_secreto = 42
total_de_tentativas = 3
rodada = 1

for rodada in range(1, total_de_tentativas + 1):

    print("Tentativa {} de {}".format(rodada, total_de_tentativas))

    chute = int(input("Digite um número entre 1 e 100: "))
    print("Você digitou ", chute)

    if chute < 1 or chute > 100:
        print("Você deve digitar um número entre 1 e 100!")
        continue

    if chute == numero_secreto:
        print("Você acertou!")
        break
    else:
        if chute > numero_secreto:
            print("Você errou! O seu chute foi maior do que o número secreto.")
        else:
            print("Você errou! O seu chute foi menor do que o número secreto.")

print("Fim do jogo.")
