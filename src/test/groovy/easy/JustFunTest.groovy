package easy

import spock.lang.Specification

class JustFunTest extends Specification {
    def sut = new JustFun()

    def "should map to map groupped by length"() {
        given:
        def input = ["Karol", "test", "abc", "loraK"] as String[]

        when:
        def result = sut.mapToMapByLength(input)

        then:
        result == [
                3: ["abc"],
                4: ["test"],
                5: ["Karol", "loraK"]
        ]
    }

    def "should sum strings len"() {
        given:
        def input = ["Karol", "test", "abc", "loraK"] as String[]

        when:
        def result = sut.allStringsLength(input)

        then:
        result == 17
    }
}
