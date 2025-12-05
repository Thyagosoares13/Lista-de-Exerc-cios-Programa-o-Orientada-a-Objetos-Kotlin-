fun isPalindrome(s: String): Boolean {
    val filtrada = s.filter { it.isLetterOrDigit() }.lowercase()
    var i = 0
    var j = filtrada.lastIndex
    while (i < j) {
        if (filtrada[i] != filtrada[j]) return false
        i++
        j--
    }
    return true
}

fun main() {
    val s = "A man, a plan, a canal: Panama"
    println("ValidPalindrome -> ${isPalindrome(s)}")
}
