package medium

import kotlin.math.abs

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

data class TreeState(val maxDiff: Int, val min: Int, val max: Int)
class Solution {

    fun maxAncestorDiff(root: TreeNode?): Int {
        val leftVal = root?.left?.let { minMax(it) }
        val rightVal = root?.right?.let { minMax(it) }

        val leftMaxDiff = leftVal?.let { maxOf(it.maxDiff, abs(it.min - root.`val`), abs(it.max - root.`val`)) } ?: 0
        val rightMaxDiff = rightVal?.let { maxOf(it.maxDiff, abs(it.min - root.`val`), abs(it.max - root.`val`)) } ?: 0

        return maxOf(leftMaxDiff, rightMaxDiff)
    }

    private fun minMax(node: TreeNode): TreeState {
        if (node.left == null && node.right == null) {
            return TreeState(0, node.`val`, node.`val`)
        } else if (node.left != null && node.right == null) {
            val nodeVal = minMax(node.left!!)
            val maxDiff = maxOf(nodeVal.maxDiff, abs(nodeVal.min - node.`val`), abs(nodeVal.max - node.`val`))

            val max = maxOf(nodeVal.max, node.`val`)
            val min = minOf(nodeVal.min, node.`val`)

            return TreeState(maxDiff, min, max)

        } else if (node.left == null && node.right != null) {
            val nodeVal = minMax(node.right!!)
            val maxDiff = maxOf(nodeVal.maxDiff, abs(nodeVal.min - node.`val`), abs(nodeVal.max - node.`val`))

            val max = maxOf(nodeVal.max, node.`val`)
            val min = minOf(nodeVal.min, node.`val`)

            return TreeState(maxDiff, min, max)
        } else {
            val leftVal = minMax(node.left!!)
            val rightVal = minMax(node.right!!)

            val maxDiff = maxOf(
                leftVal.maxDiff, rightVal.maxDiff,
                abs(leftVal.min - node.`val`), abs(leftVal.max - node.`val`),
                abs(rightVal.min - node.`val`), abs(rightVal.max - node.`val`),
            )
            val max = maxOf(leftVal.max, rightVal.max, node.`val`)
            val min = minOf(leftVal.min, rightVal.min, node.`val`)
            return TreeState(maxDiff, min, max)
        }
    }
}