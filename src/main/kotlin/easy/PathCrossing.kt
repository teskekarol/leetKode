package easy

class PathCrossing {

    fun isPathCrossing(path: String): Boolean {
        val points = mutableSetOf<Pair<Int, Int>>()
        points.add(Pair(0, 0))
        var previousPoint = Pair(0, 0)
        path.asSequence().forEach {
            val newPoint = generateNextPoint(previousPoint, it)
            if (points.contains(newPoint)) {
                return true
            }
            points.add(previousPoint)
            previousPoint = newPoint
        }
        return false
    }

    private fun generateNextPoint(previousPoint: Pair<Int, Int>, direction: Char) = when (direction) {
        'N' -> Pair(previousPoint.first + 1, previousPoint.second)
        'S' -> Pair(previousPoint.first - 1, previousPoint.second)
        'W' -> Pair(previousPoint.first, previousPoint.second - 1)
        'E' -> Pair(previousPoint.first, previousPoint.second + 1)
        else -> throw RuntimeException()
    }
}