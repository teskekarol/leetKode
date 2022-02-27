package easy

import spock.lang.Specification

class DecodeXORedArrayTest extends Specification {
    def sut = new DecodeXORedArray()

    def "should solve simple case"() {
        given:
        def encoded = [1, 2, 3] as int[]
        def first = 1

        when:
        def result = sut.decode(encoded, first)

        then:
        result == [1, 0, 2, 1] as int[]
    }

    def "should solve second case"() {
        given:
        def encoded = [6, 2, 7, 3] as int[]
        def first = 4

        when:
        def result = sut.decode(encoded, first)

        then:
        result == [4, 2, 0, 7, 4,] as int[]
    }

}
