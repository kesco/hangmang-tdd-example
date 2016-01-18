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
        assertEquals("_____", game!!.display())
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
        assertEquals(10, game!!.tries())
        assertEquals("b", game!!.used())
    }

    @Test
    fun testInput() {
        game!!.new()
        assertFalse(game!!.input('a'))
        assertEquals(11, game!!.tries())
        assertEquals("a", game!!.used())
        assertTrue(game!!.input('k'))
        assertEquals(10, game!!.tries())
        assertEquals("ak", game!!.used())
        assertEquals("k____", game!!.display())
    }

    @Test
    fun testPass() {
        game!!.new()
        val actulAnswer = charArrayOf('k', 'e', 's', 'c', 'o')
        for (ch in actulAnswer) {
            assertTrue(game!!.input(ch))
        }
        assertTrue(game!!.pass())

        game!!.new()
        val wrongAnswer = charArrayOf('a', 's', 'd', 'f', 'g', 'h', 'j', 'k'
                , 'l', 'q', 'w', 'k', 'e', 's', 'c', 'o')
        for (ch in wrongAnswer) {
            game!!.input(ch)
        }
        assertFalse(game!!.pass())
    }
}
