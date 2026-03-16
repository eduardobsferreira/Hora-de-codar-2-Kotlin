//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
    println("Informe o primeiro valor:")
    val valor1 = readln().toIntOrNull() ?: 0
    println("Informe o segundo valor:")
    val valor2 = readln().toIntOrNull() ?:0
    println("Informe o terceiro valor:")
    val valor3 = readln().toIntOrNull() ?:0

    val menor = minOf(valor1, valor2, valor3)
    val Somadosmaiores = valor1 + valor2 + valor3 - menor

    println("A soma dos dois maiores é: $Somadosmaiores ")
    }
