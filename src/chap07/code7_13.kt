package chap07

fun cond1(): Boolean {
    println("cond1を実行")
    return true
}

fun cond2(): Boolean {
    println("cond2を実行")
    return false
}

fun main() {
//    println("true xor true: ${true xor true}")
//    println("true xor false: ${true xor false}")
//    println("false xor true: ${false xor true}")
//    println("false xor false: ${false xor false}")
//
//    val a = true
//    val b = false
//
//    !a && !b == !(a || b)
//    !a || !b == !(a && b)

    if (cond1() || cond2()) {
        println("どちらかが true")
    } else {
        println("両方 false")
    }

    val a = 0
    a != 0 || cond1()

    if (a != 0) {
        cond1()
    }
}