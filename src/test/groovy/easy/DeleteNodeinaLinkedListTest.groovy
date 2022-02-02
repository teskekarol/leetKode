package easy

import spock.lang.Specification

import static easy.DeleteNodeinaLinkedList.*

class DeleteNodeinaLinkedListTest extends Specification {
    def sut = new DeleteNodeinaLinkedList()

    def "should solve simple case"() {
        given:
        def root = new ListNode(4)
        root.next = new ListNode(5)
        root.next.next = new ListNode(1)
        root.next.next.next = new ListNode(9)

        when:
        sut.deleteNode(root.next)

        then:
        root.next.val == 1
    }
}
