package easy

class MinimumIndexSumofTwoLists {

    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val results = mutableMapOf<Int, MutableList<String>>()

        list1.forEachIndexed { index, element ->
            val second = list2.indexOf(element)
            if (second != -1) {
                val sum = index + second
                val newList = results.getOrDefault(sum, mutableListOf()).also { it.add(element) }
                results[sum] = newList
            }
        }

        return results.keys.minOrNull()?.let { results[it]?.toTypedArray() }!!
    }

}