//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
    println("Informe um valor:")
    val valor = readln().toDoubleOrNull()

    if (valor == null) {
        println("Valor inválido")
    } else {
        when {
            valor > 0 -> println("O valor informado é positivo.")
            valor < 0 -> println("O valor informado é negativo.")
            else -> println("O valor informado é zero.")

        }
    }
}
