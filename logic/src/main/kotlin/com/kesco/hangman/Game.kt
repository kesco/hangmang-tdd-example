package com.kesco.hangman

/**
 * [HangMan](http://www.twoplayergames.org/play/668-Hangman.html) Logic
 */
class Game() {
    var _answer: String = ""
    var _used: String = ""

    fun new() {
        _answer = "kesco"
        _used = ""
    }

    fun input(c: Char): Boolean {
        _used += c
        return false
    }

    fun length(): Int {
        return 5
    }

    fun tries(): Int {
        return 11
    }

    fun used(): String = _used

    fun answer(): String {
        return "kesco"
    }
}
