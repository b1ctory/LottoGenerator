import java.util.*
import kotlin.random.Random

fun createNumber(): List<Int> {
    val nums = mutableListOf<Int>()
    while(nums.size < 6){
        val randomNumber = Random.nextInt(1, 46)
        if (!nums.contains(randomNumber)) nums.add(randomNumber)
    }
    return nums
}

fun printNumber(nums: List<Int>) {
    
}

fun main() {
    val upTo = Scanner(System.`in`).nextInt()
}