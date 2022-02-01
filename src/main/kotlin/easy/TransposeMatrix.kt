package easy

class TransposeMatrix {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val external = matrix[0].size
        val result = (0 until external).map { counter ->
            matrix.map { it[counter] }.toIntArray()
        }

        return result.toTypedArray()
    }
}