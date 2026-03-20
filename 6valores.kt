//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val valores = mutableListOf<Int>()
    for (i in 1..6) {
        print("Digite o ${i} valor:")
        val numero = readln().toInt()
        valores.add(numero)
    }
    val soma = valores.filter { it < 72 }.sum()

    println("\n Valores informados: $valores")
    println("Soma do valores inferiores a 72: $soma")
}