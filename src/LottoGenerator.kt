import java.util.*
import kotlin.random.Random

fun printNumber(nums: List<Int>, idx: Int) {
    print("[ NO.${idx} ] : ")
    for (num in nums) {
        print("$num ")
    }
    println()
}

fun createNumber() : List<Int> {
    val nums = mutableListOf<Int>()
    while(nums.size < 7){
        val randomNumber = Random.nextInt(1, 46)
        if (!nums.contains(randomNumber)) nums.add(randomNumber)
    }

    return nums
}

fun main() {
    println("[ Lotto Generator ]")
    print("횟수를 입력하세요. : ")
    val input = Scanner(System.`in`).nextInt()

    for (i in 1..input) {
        printNumber(createNumber(), i)
    }
}