package belajar.kotlin.unit.test

import org.junit.Test

// Class CalculatorTest untuk testing class Calculator
class CalculatorTest {

    val calculator = Calculator()

    // Untuk testing method add ketika penambahan berhasil.
    @Test
    fun testAddSuccess() {
        val result = calculator.add(10, 10)
    }

    // Testing ke-2 yang mana method yang di testing sama dengan di atas
    @Test
    fun testAddSuccess2() {
        val result = calculator.add(10, 10)
    }
}