package medium

import spock.lang.Specification
import spock.lang.Unroll

class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest extends Specification {

    def sut = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers()

    @Unroll
    def "should solve"() {
        when:
        def result = sut.minPartitions(left)

        then:
        result == expected

        where:
        left                   || expected
        "101"                  || 1
        "1"                    || 1
        "32"                   || 3
        "82734"                || 8
        "27346209830709182346" || 9
    }
}
