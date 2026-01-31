package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    if (count == 0) emptyArray<Int>()
    val monkeyArray = IntArray(count)
    for (i in 0 until count) {
        monkeyArray[i] = i + 1
    }
    return monkeyArray
}
