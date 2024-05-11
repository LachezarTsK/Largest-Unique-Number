
public class Solution {

    private static final int[] RANGE_OF_VALUES = {0, 1000};
    private static final int NO_UNIQUE_INT_FOUND = -1;

    public int largestUniqueNumber(int[] input) {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        for (int value : input) {
            ++frequency[value];
        }

        for (int value = RANGE_OF_VALUES[1]; value >= RANGE_OF_VALUES[0]; --value) {
            if (frequency[value] == 1) {
                return value;
            }
        }

        return NO_UNIQUE_INT_FOUND;
    }
}
