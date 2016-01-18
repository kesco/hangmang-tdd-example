package com.kesco.hangman

import kotlin.text.contains

/**
 * [HangMan](http://www.twoplayergames.org/play/668-Hangman.html) Logic
 */
class Game() {
    var _answer: String = ""
    var _display: String = ""
    var _used: String = ""
    var _tries:Int = 12

    fun new() {
        _answer = "kesco"
        _used = ""
    }

    fun input(c: Char): Boolean {
        _used += c
        _tries -= 1
        return _answer.contains(c)
    }

    fun length(): Int {
        return 5
    }

    fun tries(): Int = _tries

    fun used(): String = _used

    fun answer(): String {
        return "kesco"
    }

    fun pass(): Boolean {
    }

    fun display(): String {
    }
}
