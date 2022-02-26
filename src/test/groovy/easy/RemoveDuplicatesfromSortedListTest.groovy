package easy

import spock.lang.Specification

class RemoveDuplicatesfromSortedListTest extends Specification {

    def sut = new RemoveDuplicatesfromSortedList()

    def "should solve simple case"() {
        given:
        def last = new RemoveDuplicatesfromSortedList.ListNode(2)
        def node2 = new RemoveDuplicatesfromSortedList.ListNode(1, last)
        def node1 = new RemoveDuplicatesfromSortedList.ListNode(1, node2)

        when:
        def result = sut.deleteDuplicates(node1)

        then:
        result.val == 1
        result.next.val == 2
    }
}
