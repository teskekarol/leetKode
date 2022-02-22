package easy

import spock.lang.Specification

class RemoveElementTest extends Specification {

    def sut = new RemoveElement()

    def "should remove elements2 "() {
        given:
        def nums = [3,2,2,3] as int[]

        when:
        def result = sut.removeElement(nums, 3)

        then:
        result == 2

    }

    def "should remove elements"() {
        given:
        def nums = [0,1,2,2,3,0,4,2] as int[]

        when:
        def result = sut.removeElement(nums, 2)

        then:
        result == 5

    }
}
