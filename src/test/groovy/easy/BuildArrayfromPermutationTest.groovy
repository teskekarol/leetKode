package easy

import spock.lang.Specification
import spock.lang.Unroll

class BuildArrayfromPermutationTest extends Specification {
    def sut = new BuildArrayfromPermutation()

    def "should solve simple case"() {
        given:
        def input = [0, 2, 1, 5, 3, 4] as int[]

        when:
        def result = sut.buildArray(input)

        then:
        result == [0, 1, 2, 4, 5, 3] as int[]
    }


    @Unroll
    def "should solve other cases"() {
        when:
        def result = sut.buildArray(left as int[])
        then:
        result == expected as int[]
        where:
        left               || expected
        [5, 0, 1, 2, 3, 4] || [4, 5, 0, 1, 2, 3]
    }
}
