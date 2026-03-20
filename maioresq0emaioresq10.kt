//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val valores = mutableListOf<Double>()

    for (i in 1..4) {
        print("Digite o ${i}º valor (entre 0 e 10): ")
        val numero = readln()!!.toDouble()
        valores.add(numero)
    }

    val valoresValidos = valores.filter { it > 0 && it < 10 }

    if (valoresValidos.isNotEmpty()) {
        val media = valoresValidos.average()

        println("\nValores informados: $valores")
        println("Valores válidos considerados na média: $valoresValidos")
        println("Média: %.2f".format(media))

        if (media > 5) {
            println("Você passou no teste")
        } else {
            println("Tente novamente")
        }
    } else {
        println("\nNenhum valor válido foi informado (todos fora do intervalo 0 < x < 10).")
    }
}