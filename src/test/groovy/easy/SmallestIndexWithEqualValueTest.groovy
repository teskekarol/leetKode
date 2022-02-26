package easy

import spock.lang.Specification

class SmallestIndexWithEqualValueTest extends Specification {
    def sut = new SmallestIndexWithEqualValue()

    def "should resolve simple example"() {
        given:
        def input = [0, 1, 2] as int[]

        when:
        def result = sut.smallestEqual(input)

        then:
        result == 0
    }

}
