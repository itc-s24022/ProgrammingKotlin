

import java.util.Scanner
/**
 * 映画館で料金を計算するプログラム
 * シニア→一般→子供の順で人数を入力する
 * 一人当たりの料金はシニア1,300、一般2,000、子供1,000
 * ただし10名以上だと各人の料金を200円割引にする
 */

fun main() {
    val senior = 1300
    val general = 2000
    val child = 1000

    val sc = Scanner(System.`in`)
    println("シニアの人数はいくついますか?")
    val sen = sc.nextInt()
    println("一般の人数はいくついますか?")
    val gen = sc.nextInt()
    println("子供の人数はいくついますか?")
    val chi = sc.nextInt()

    val total = (sen * senior) + (gen * general) + (chi * child)
    val discount = if (sen + gen + chi >= 10) total - (total * 0.2) else total
    println("合計金額は${discount.toInt()}円です")
}
