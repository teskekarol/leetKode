package medium

import spock.lang.Specification

class NumberofLaserBeamsinaBankTest extends Specification {
    def sut = new NumberofLaserBeamsinaBank()

    def "should solve first case"() {
        given:
        def input = ["011001","000000","010100","001000"] as String[]

        when:
        def result = sut.numberOfBeams(input)

        then:
        result == 8

    }
}
