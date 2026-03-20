//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   // Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte forma: 1: feminino - 2: masculino - ) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas
    println("Digite sua altura:")
    val altura = readln()?.toDoubleOrNull() ?:return

    println("Digite o gênero ao qual você se identifica (1: feminino, 2: masculino):")
    val genero = readln()?.toIntOrNull() ?:return

    var pesoideal = 0.0

    if (genero == 1){
        pesoideal = (62.1 * altura) - 44.7
        println("seu peso ideal: $pesoideal")
    }
    else if (genero == 2 ){
        pesoideal = (72.7 * altura) - 44.7
        println ("seu peso ideal: $pesoideal")
    }

}
