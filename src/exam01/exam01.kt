
/**
 * キーボードから数字を入力して、１から入力された数までの
 * FizzBuzzを出力するプログラムを作成してください
 * 
 * FizzBuzzとは
 * 3の倍数のときBuzz
 * 5の倍数のときFizz
 * 3と5の倍数のときFizzBuzz
 * それ以外の場合はその数をそのまま出力
 * よくある問題
 */
 val input = readLine()!!.toInt()

 fun main() {
     for (i in 1..input) {
         if (i % 3 == 0 && i % 5 == 0) {
             println("FizzBuzz")
         } else if (i % 3 == 0) {
             println("Fizz")
         } else if (i % 5 == 0) {
             println("Buzz")
         } else {
             println(i)
         }
     }
 }