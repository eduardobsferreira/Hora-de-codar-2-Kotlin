//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //  Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
        val valores = mutableListOf<Double>()

        for (i in 1..6) {
            print("Digite o valor $i: ")
            val valor = readLine()?.toDoubleOrNull()

            if (valor == null) {
                println("Valor inválido, será considerado 0.")
                valores.add(0.0)
            } else {
                valores.add(valor)
            }
        }

        println("\nValores informados: $valores")

        val soma = valores.sum()
        val media = soma / valores.size

        println("A média aritmética dos valores é: $media")
    }


