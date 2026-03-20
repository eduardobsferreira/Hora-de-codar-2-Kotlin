//Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
fun main() {
    val valores =mutableListOf<Int>()
    for (i in 1..4) {
        print("Digite o ${i} valor:")
        val numero = readln().toInt()
        valores.add (numero)
    }

    val primeiro = valores.first()
    val último = valores.last()
    val maior = valores.maxOrNull()

    println("Primeiro valor informado: $primeiro" )
    println("último valor infornado : $último")
    println("Maior valor informado: $maior")
}
