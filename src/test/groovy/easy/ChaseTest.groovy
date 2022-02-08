package easy

import spock.lang.Specification

class ChaseTest extends Specification {
    def sut = new ChaseJava()

    def "should solve"() {
        when:
        def result = sut.test()

        then:
        result == ""
    }
}
