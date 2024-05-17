package com.prosoft

/**
 * Второй вариант точки входа в Kotlin (с аргументами командной строки)
 */
fun main(vararg args: String) {
    println("Hello $args")                       // Hello [Ljava.lang.String;@15aeb7ab
    println("Hello ${args.contentToString()}")   // Hello []
}