package easy

import spock.lang.Specification

class ConcatenationofArrayTest extends Specification {

    def sut = new ConcatenationofArray()

    def "should solve simple case"() {
        given:
        def input = [1, 2, 1] as int[]

        when:
        def result = sut.getConcatenation(input)

        then:
        result == [1, 2, 1, 1, 2, 1] as int[]

    }
}
