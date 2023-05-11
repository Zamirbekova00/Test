package com.example.test

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("5", math?.add("3", "2"))
    }

    @Test
    fun symbolAdd() {
        assertEquals("Нельзя вводить буквы", math?.add("5fkn", "7"))
    }
    @Test
    fun doubleAdd() {
        assertEquals("12.8", math?.add("5.0", "7.5"))
    }

    @Test
   fun simpleDivide() {
      assertEquals("2", math?.divide("4", "2"))
  }

    @Test
    fun zeroDivide() {
        assertEquals("Нельзя делить на ноль", math?.divide("2", "0"))
    }

    @Test
    fun nullDivide(){
        assertEquals("Нельзя вводить пустоту",math?.divide("12",""))
    }

    @Test
    fun negativeAdd(){
        assertEquals("-5",math?.add("-12","7"))
    }

    @After
    fun detach() {
        math = null
    }
}
