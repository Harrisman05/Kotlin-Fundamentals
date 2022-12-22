/*
Spread Operator in Kotlin is *, is used to unpack an array of values into
a function so that vararg string parameter doesn't error with type mismatch
 */
fun printSentences(vararg sentence: String) {
    sentence.forEach { sentence ->
        println(sentence)
    }
}
fun main() {
    var phrases = arrayOf("Sentence 1", "Sentence 2", "Sentence 3")
    printSentences(*phrases)
}