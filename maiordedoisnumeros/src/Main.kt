//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.
    println("digite o primeiro valor:")
    var valor1 = readln().toDouble()

       println("digite o segundo valor:")
        val valor2 = readln().toDouble()

       val maior = if (valor1>valor2) valor1 else valor2
    println("O número maior é: $maior")
}