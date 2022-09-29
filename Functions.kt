fun main() {
    // val is an immutable reference and cannot be changed later
    // Kotlin will recognize variable types automatically
    // Syntax to declare a type is:
    // val count: Int = 2
    val count = 2
    //  count = 3
    //  This would give an error if not commented out.
    val message = "Hello World"
    val isTrue = true

    // var is a mutable reference and therefore can be changed
    var number = 0
    var text = "Default Text"
    var isFalse = false

    number += count
    text = "Hello Kotlin"
    isFalse = isTrue

    println(count)
    println("You have $number unread messages.")
    println(message)
}