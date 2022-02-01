package easy

import spock.lang.Specification

class TransposeMatrixTest extends Specification {

    def sut = new TransposeMatrix()

    def "should transpose matrix"() {
        given:
        def input = [[1,2,3],[4,5,6],[7,8,9]] as int[][]

        when:
        def result = sut.transpose(input)

        then:
        result == [[1,4,7],[2,5,8],[3,6,9]] as int[][]

    }

    def "should transpose matrix2"() {
        given:
        def input = [[1,2,3],[4,5,6]] as int[][]

        when:
        def result = sut.transpose(input)

        then:
        result == [[1,4],[2,5],[3,6]] as int[][]

    }
}
