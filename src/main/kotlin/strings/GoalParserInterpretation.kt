package strings

import array.removeElement

// command consists of "G", "()", and/or "(al)" in some order.
/**
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
 */
fun main() {
    var command: String = "G()(al)"
    println(interpret(command = command))

}

fun interpret(command: String) = command.replace("()", "o").replace("(al)", "al")

