fun twoSumII(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.lastIndex
    while (left < right) {
        val soma = numbers[left] + numbers[right]
        when {
            soma == target -> return intArrayOf(left, right)
            soma < target -> left++
            else -> right--
        }
    }
    return intArrayOf()
}

fun main() {
    val numbers = intArrayOf(2, 3, 4, 9)
    val target = 6
    val res = twoSumII(numbers, target)
    println("TwoSumII -> [${res.joinToString()}]")
}

