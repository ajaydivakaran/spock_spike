package me.spike

import spock.lang.Specification

class AdditionTest extends Specification {

    def "addition of 2 numbers"() {
        given:
        def a = 10
        def b = 20

        when:
        def result = a + b

        then:
        result == 30
    }
}
