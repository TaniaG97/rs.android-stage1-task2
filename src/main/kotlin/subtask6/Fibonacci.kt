package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        var previous = 0
        var current = 1

        while (previous * current < n) {
            val sum = previous + current
            previous = current
            current = sum
        }
        return if (previous * current == n) intArrayOf(previous,current,1) else intArrayOf(previous,current,0)
    }
}
