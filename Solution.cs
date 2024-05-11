
using System;

public class Solution
{
    private static readonly int[] RANGE_OF_VALUES = { 0, 1000 };
    private static readonly int NO_UNIQUE_INT_FOUND = -1;

    public int LargestUniqueNumber(int[] input)
    {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        foreach (int value in input)
        {
            ++frequency[value];
        }

        for (int value = RANGE_OF_VALUES[1]; value >= RANGE_OF_VALUES[0]; --value)
        {
            if (frequency[value] == 1)
            {
                return value;
            }
        }

        return NO_UNIQUE_INT_FOUND;
    }
}
