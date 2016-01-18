package com.kesco.hangman

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GameTest() {
    var game: Game? = null

    @Before
    fun setUp() {
        game = Game()
    }

    @Test
    fun testOperation() {
        game?.new()
        assertFalse(game!!.input('a'))
        assertEquals(5, game!!.length())
        assertEquals(11, game!!.tries())
        assertEquals("a", game!!.used())
        assertEquals("kesco", game!!.answer())
    }

    @Test
    fun testNew() {
        game!!.new()
        assertFalse(game!!.input('a'))
        assertEquals(5, game!!.length())
        assertEquals(11, game!!.tries())
        assertEquals("a", game!!.used())
        game!!.new()
        assertFalse(game!!.input('b'))
        assertEquals(5, game!!.length())
        assertEquals(11, game!!.tries())
        assertEquals("b", game!!.used())
    }
}
