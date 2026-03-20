fun main(){
    println("Informe o primeiro valor: ")
    var n1 = readln().toInt()

    println("Informe o segundo valor: ")
    var n2 = readln().toInt()

    println("\nEscolha a operação:")
    println("1. Adição")
    println("2. Subtração")
    println("3. Divisão")
    println("4. Multiplicação")

    val operacao = readln().toInt()

    if(operacao == 1){
        val resultado = n1 + n2
        println("Resulta da adição: $resultado")
    }
    else if(operacao == 2){
        val resultado = n1 - n2
        println("Resultado da subtração: $resultado")
    }
    else if (operacao == 3){
        val resultado = n1 / n2
        println("Resultado da divisão: $resultado")
    }
    else if (operacao == 4){
        val resultado = n1 * n2
        println("Resultado da multiplicação: $resultado")
    }
}