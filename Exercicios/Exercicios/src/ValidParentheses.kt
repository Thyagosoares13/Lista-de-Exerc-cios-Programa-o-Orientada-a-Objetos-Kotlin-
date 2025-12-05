fun isValidParentheses(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    for (c in s) {
        when (c) {
            '(', '{', '[' -> stack.addLast(c)
            ')', '}', ']' -> {
                if (stack.isEmpty()) return false
                val topo = stack.removeLast()
                if ((c == ')' && topo != '(') ||
                    (c == '}' && topo != '{') ||
                    (c == ']' && topo != '[')) return false
            }
        }
    }
    return stack.isEmpty()
}

fun main() {
    val s = "({[]})"
    println("ValidParentheses -> ${isValidParentheses(s)}")
}

