package com.prosoft

import java.util.Arrays

/**
 * Первый вариант точки входа в Kotlin (без аргументов)
 */
fun main() {
    val name = "Kotlin"
    println("Hello, $name!")

    /** Использование цифровых литералов */
    val long = 1_000_000_000L
    val decimal = 123
    val binary = 0b11111011
    val octal = Integer.parseInt("0777") // 0777
    val hex = 0xFF

    val float = 12.34
    val double = 12.34e10
    val decimalLong = 123L
    val doubleLong = 12.34F
    val unsigned = 123U
    val short = 123.toShort() // 123S
    val byte = 123.toByte() // 123B

    /** Преобразование типов */
    val a: Int = 1
    // val b: Long = a // Type mismatch: inferred type is Int but Long was expected
    val b: Long = a.toLong()

    /** Нечисловые типы: логические, символы, массивы  */
    val logic = false

    val char = 'a'

    val array = arrayOf(1, 2, 3) // возвращает массив объектов типа T, может содержать NULL
    val emptyArr = emptyArray<Int>()
    val arrayCalc = Array(5) {i -> (i * i)}
    val intArray = intArrayOf(1, 2, 3) // возвращает массив примитивных значений типа int, не может содержать NULL
    val byteArray = byteArrayOf(1, 2, 3)

    println(intArray.contentToString())

    val item = array[2]
    val item2 = array.get(2)

    /** Нечисловые типы: строки, многострочные строки, шаблоны строк */
    val text: String = "SALT II was a series of talks between United States \n and Soviet negotiators from 1972 to 1979"
    println(text)

    val text2: String = """
                        SALT II was a series of talks between United States
                        and Soviet negotiators from 1972 to 1979.
                        It was a continuation of the SALT I talks.
                    """
    println(text2)

    val firstName = "Tom"
    println("Hello, $name!")  // аналогично println("Hello, " + name + "!")

    val digit = 2
    println("2x2 = ${digit * digit}") // выражения заключаются в скобки { }

    /** Особые типы: Any  */
    var name2: Any = "Tom"
    println(name2)   // Tom
    name2 = 6758
    println(name2)   // 6758

    /** TypeCast: преобразование типов */
    val digitName: Any = 100
    val digitNum = digitName as Int
    println(digitNum)
    // val digitNum2 = digitName as String // ClassCastException
    val digitNum2 = digitName as? String // вернет на ClassCastException, а null
    println(digitNum2)

    var any: Any = "12"
    if (any is String) {
        println(any + "test")
    }

}