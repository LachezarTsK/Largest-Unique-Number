
class Solution {

    private companion object {
        val RANGE_OF_VALUES = intArrayOf(0, 1000)
        const val NO_UNIQUE_INT_FOUND = -1;
    }

    fun largestUniqueNumber(input: IntArray): Int {
        val frequency = IntArray(RANGE_OF_VALUES[1] + 1);
        for (value in input) {
            ++frequency[value];
        }

        for (value in RANGE_OF_VALUES[1] downTo RANGE_OF_VALUES[0]) {
            if (frequency[value] == 1) {
                return value;
            }
        }

        return NO_UNIQUE_INT_FOUND;
    }
}
