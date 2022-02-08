package easy

import spock.lang.Specification
import spock.lang.Unroll

class MinimumValuetoGetPositiveStepbyStepSumTest extends Specification {

    def sut = new MinimumValuetoGetPositiveStepbyStepSum()

    @Unroll
    def "should solve"() {
        when:
        def result = sut.minStartValue(left as int[])

        then:
        expected == result
        where:
        left              || expected
        [-3, 2, -3, 4, 2] || 5
        [1, 2]            || 1
        [1, -2, -3]       || 5
    }
}
