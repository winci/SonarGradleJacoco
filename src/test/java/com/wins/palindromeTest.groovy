package com.wins

import spock.lang.Specification

/**
 * Created by Dainish on 3/17/17.
 */
class palindromeTest extends Specification {
    def "Main"() {

    }

    def "given string is a palindrome"() {
        given:
        String input = "Amalya"
        boolean result = false

        when:
        result =  palindrome.isPalindrome(input)

        then:
        result == true

    }
}
