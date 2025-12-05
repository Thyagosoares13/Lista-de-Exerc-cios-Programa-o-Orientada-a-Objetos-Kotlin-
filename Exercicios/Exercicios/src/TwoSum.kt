fun twoSum(nums: IntArray, target: Int): IntArray {
    val mapa = HashMap<Int, Int>()   // valor -> índice
    for (i in nums.indices) {
        val complemento = target - nums[i]
        if (mapa.containsKey(complemento)) {
            return intArrayOf(mapa[complemento]!!, i)
        }
        mapa[nums[i]] = i
    }
    return intArrayOf()
}
