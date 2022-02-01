package easy

import spock.lang.Specification
import spock.lang.Unroll

class PathCrossingTest extends Specification {
    def sut = new PathCrossing()

    @Unroll
    def "should pass testcases"() {
        when:
        def result = sut.isPathCrossing(left)

        then:
        result == expected

        where:
        left    || expected
        "NES"   || false
        "NESWW" || true
    }

    def "should solve complicated case"() {
        given:
        def input = "NNSWWEWSSESSWENNW"

        when:
        def result = sut.isPathCrossing(input)

        then:
        result
    }
}
