//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Informe o primeiro valor:")
    val  valor1 = readln().toIntOrNull() ?:0

    println("Informe o segundo valor:")
    val valor2 = readln().toIntOrNull() ?:0

    println("Informe o terceiro valor: ")
    val valor3 = readln().toIntOrNull() ?:0
    val maior = when {
        valor1 > valor2 && valor3 > valor3 -> valor1
        valor2 > valor1 && valor2 > valor3 -> valor2
          else -> valor3
    }
    println("O maior valor informado é: $maior")
}