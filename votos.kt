//Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
fun main() {
       println("Informe seu ano de nascimento:")
      val Anodenascimento = readln().toInt()

    val anoatual = 2026
    val idade = anoatual - Anodenascimento

    if (idade>=16 ) {
        println("Você poderá votar esse ano! ")
    }

        else{ (idade<=16)
        println("Você não poderá votar esse ano!")
    }
}