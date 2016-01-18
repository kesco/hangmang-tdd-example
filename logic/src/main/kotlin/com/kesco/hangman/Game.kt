package com.kesco.hangman

import kotlin.text.*

/**
 * [HangMan](http://www.twoplayergames.org/play/668-Hangman.html) Logic
 */
class Game(val _answer: String, var _tries: Int) {
    var _display: String = ""
    var _used: String = ""

    fun new() {
        _used = ""
        _display = ""
        for (ch in _answer.toCharArray()) {
            _display += '_'
        }
    }

    fun input(c: Char): Boolean {
        _used += c
        _tries -= 1
        val ret = _answer.contains(c)
        if (ret) {
            var index = 0
            while (true) {
                index = _answer.indexOf(c, index)
                if (index == -1) break
                _display = _display.substring(0, index) + c + _display.substring(index + 1)
                index += 1
            }
        }
        return ret
    }

    fun length(): Int {
        return 5
    }

    fun tries(): Int = _tries

    fun used(): String = _used

    fun answer(): String = _answer

    fun pass(): Boolean {
        if (_tries < 1) return false
        return _display.equals(_answer)
    }

    fun display(): String = _display
}
