package me.spike

import spock.lang.Specification

class LibraryTest extends Specification {

    def objectMapper = Mock(ObjectMapper)

    def "mock third party lib"() {
        given:
        objectMapper.writeValueAsString(_) >> "some-message"

        when:
        def result = objectMapper.writeValueAsString("foo")

        then:
        result == "some-message"
    }
}
