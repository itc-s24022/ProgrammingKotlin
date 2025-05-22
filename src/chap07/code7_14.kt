package chap07

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 100)
    // a が  0～59 なら D
    //      60～69 なら C
    //      70～79 なら B
    //      80～89 なら A
    //      90～   なら S
    // を a の値とともに出力してください
/*    if (a >= 0 && a<= 59) {
        println("$a : D")
    } else if (a >= 60 && a <= 69) {
        println("$a : C")
    } else if (a >= 70 && a <= 79) {
        println("$a : B")
    } else if (a >= 80 && a <= 89) {
        println("$a : A")
    } else if (a >= 90) {
        println("$a : S")
    }*/
    if (a < 60) {
        println("$a : D")
    } else if (a < 70) {
        println("$a : C")
    } else if (a < 80) {
        println("$a : B")
    } else if (a < 90) {
        println("$a : A")
    } else {
        println("$a : S")
    }
}