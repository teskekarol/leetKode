package easy

import spock.lang.Specification
import spock.lang.Unroll

class IsomorphicStringTest extends Specification {

    def sut = new IsomorphicString()


    @Unroll
    def "should solve simple case"() {
        when:
        def result = sut.isIsomorphic(inputLeft, inputRight)

        then:
        result == expected

        where:
        inputLeft | inputRight || expected
        "egcd"    | "adfd"     || false
        "egg"     | "add"      || true
        "foo"     | "bar"      || false
        "badc"    | "baba"     || false
        "paper"   | "title"    || true
    }
}
