package easy

import spock.lang.Specification
import spock.lang.Unroll

class RepeatedSubstringPatternTest extends Specification {

    def sut = new RepeatedSubstringPattern()

    @Unroll
    def "should solve cases"() {
        when:
        def result = sut.repeatedSubstringPattern(left)

        then:
        result == expected

        where:
        left           || expected
        "abab"         || true
        "aba"          || false
        "abcabcabcabc" || true
        "aabaaba"      || false
    }
}
