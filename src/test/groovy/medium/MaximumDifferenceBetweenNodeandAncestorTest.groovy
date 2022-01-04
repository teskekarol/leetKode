package medium

import spock.lang.Specification

class MaximumDifferenceBetweenNodeandAncestorTest extends Specification {
    def sut = new Solution()

    def "should pass even more complex day"() {
        given:
        def root = new TreeNode(2)
        root.left = new TreeNode(4)
        root.left.left = new TreeNode(1)
        root.left.left.right = new TreeNode(6)
        root.right = new TreeNode(3)
        root.right.left = new TreeNode(0)
        root.right.right = new TreeNode(5)
        root.right.right = new TreeNode(7)

        when:
        def result = sut.maxAncestorDiff(root)

        then:
        result == 5
    }

    def "should pass complex case"() {
        given:
        def root = new TreeNode(8)
        root.left = new TreeNode(3)
        root.right = new TreeNode(10)
        root.right.right = new TreeNode(14)
        root.right.right.left = new TreeNode(13)
        root.left.left = new TreeNode(1)
        root.left.right = new TreeNode(6)
        root.left.right.left = new TreeNode(4)
        root.left.right.right = new TreeNode(7)

        when:
        def result = sut.maxAncestorDiff(root)

        then:
        result == 7

    }

    def "should pass"() {
        given:
        def root = new TreeNode(1)
        root.left = null
        root.right = new TreeNode(2)
        root.right.left = null
        root.right.right = new TreeNode(0)
        root.right.right.left = new TreeNode(3)

        when:
        def result = sut.maxAncestorDiff(root)

        then:
        result == 3
    }

    def "should pass base case"() {
        given:
        def root = new TreeNode(8)
        root.left = new TreeNode(3)
        root.right = new TreeNode(10)

        root.left.left = new TreeNode(1)
        root.left.right = new TreeNode(6)

        root.right.right = new TreeNode(14)

        root.left.right.left = new TreeNode(4)
        root.left.right.right = new TreeNode(7)

        root.right.right.left = new TreeNode(13)

        when:
        def response = sut.maxAncestorDiff(root)

        then:
        response == 7

    }
}
