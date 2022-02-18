package easy

import spock.lang.Specification
import spock.lang.Unroll

class FindGreatestCommonDivisorofArrayTest extends Specification {
    def sut = new FindGreatestCommonDivisorofArray()

    @Unroll
    def "should cases"() {
        when:
        def result = sut.findGCD(left as int[])

        then:
        result == expected

        where:
        left             || expected
        [2, 5, 6, 9, 10] || 2
        [7, 5, 6, 8, 3]  || 1
        [3, 3]           || 3
    }
}
