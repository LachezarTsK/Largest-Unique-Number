
function largestUniqueNumber(input: number[]): number {
    const RANGE_OF_VALUES = [0, 1000];
    const NO_UNIQUE_INT_FOUND = -1;

    const frequency: number[] = new Array(RANGE_OF_VALUES[1] + 1).fill(0);
    for (let value of input) {
        ++frequency[value];
    }

    for (let value = RANGE_OF_VALUES[1]; value >= RANGE_OF_VALUES[0]; --value) {
        if (frequency[value] === 1) {
            return value;
        }
    }

    return NO_UNIQUE_INT_FOUND;
};
