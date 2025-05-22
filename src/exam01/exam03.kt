import java.util.Scanner
import kotlin.random.Random
/**
 * お釣りの合計計算
 * ランダムで100円〜9000円の数値を生成する
 * 支払う金額を入力する
 * お釣りを計算して、金額ごとにその枚数を出力
 * トータル枚数を最小の組み合わせでお釣りを返す
 * 支払う金額だ足りない場合、"お金が足りません"とだす
 */

fun main() {
    var randomNum = Random.nextInt(100, 9001)
    val sc = Scanner(System.`in`)
    println("ランドム数は${randomNum}円")
    println("お金を入力してください")
    val payment = sc.nextInt()
    if (payment < randomNum) {
        println("お金が足りません")
    } else {
        val change = payment - randomNum
        println("お釣りは${change}円")
        val coin500 = change / 500
        val coin100 = (change % 500) / 100
        val coin50 = (change % 100) / 50
        val coin10 = (change % 50) / 10
        val coin5 = (change % 10) / 5
        val coin1 = change % 5
        println("500円:${coin500}枚")
        println("100円:${coin100}枚")
        println("50円:${coin50}枚")
        println("10円:${coin10}枚")
        println("5円:${coin5}枚")
        println("1円:${coin1}枚")
    }
}
