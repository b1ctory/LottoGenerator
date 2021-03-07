# LottoGenerator 

#### [ 로또 번호를 생성하는 콘솔 프로그램 ]

1. `fun createNumber() : List<Int>`

   1. 1부터 45까지의 수 중 중복되지 않는 7개의 수를 랜덤으로 골라 List에 담는다.
   2. List를 return 한다.

   ```kotlin
   fun createNumber() : List<Int> {
       val nums = mutableListOf<Int>()
       while(nums.size < 7){
           val randomNumber = Random.nextInt(1, 46)
           if (!nums.contains(randomNumber)) nums.add(randomNumber)
       }
   
       return nums
   }
   ```

2. `fun printNumber(nums: List<Int>, idx: Int)`

   1. 매개변수로 입력받은 List의 요소를 출력한다.

   ```kotlin
   fun printNumber(nums: List<Int>, idx: Int) {
       print("[ NO.${idx} ] : ")
       for (num in nums) {
           print("$num ")
       }
       println()
   }
   ```

