package easy

import spock.lang.Specification
import spock.lang.Unroll

class LargestNumberAtLeastTwiceofOthersTest extends Specification {
    def sut = new LargestNumberAtLeastTwiceofOthers()


    @Unroll
    def "should solve cases"() {
        when:
        def result = sut.dominantIndex(input as int[])

        then:
        result == expected

        where:
        input        || expected
        [0, 0, 3, 2] || -1
        [3, 6, 1, 0] || 1
        [1, 2, 3, 4] || -1
        [1]          || 0
    }
}
