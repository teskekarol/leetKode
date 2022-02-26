package medium

import spock.lang.Specification

class MergeNodesInBetweenZerosTest extends Specification {
    def sut = new MergeNodesInBetweenZeros()

    def "should solve simple case"() {
        given:
        def root = new MergeNodesInBetweenZeros.ListNode(0,
                new MergeNodesInBetweenZeros.ListNode(3,
                        new MergeNodesInBetweenZeros.ListNode(1,
                                new MergeNodesInBetweenZeros.ListNode(0,
                                        new MergeNodesInBetweenZeros.ListNode(4,
                                                new MergeNodesInBetweenZeros.ListNode(5,
                                                        new MergeNodesInBetweenZeros.ListNode(2,
                                                                new MergeNodesInBetweenZeros.ListNode(0))))))))

        when:
        def result = sut.mergeNodes(root)

        then:
        result.val == 4
        result.next.val == 11
        result.next.next == null

    }
}
