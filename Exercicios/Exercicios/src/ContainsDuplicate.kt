fun containsDuplicate(nums: IntArray): Boolean {
    val conjunto = HashSet<Int>()
    for (n in nums) {
        if (!conjunto.add(n)) return true
    }
    return false
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    println("ContainsDuplicate -> ${containsDuplicate(nums)}")
}
