
package main

var RANGE_OF_VALUES = []int{0, 1000}
const NO_UNIQUE_INT_FOUND = -1

func largestUniqueNumber(input []int) int {
	frequency := make([]int, RANGE_OF_VALUES[1]+1)
	for _, value := range input {
		frequency[value]++
	}

	for value := RANGE_OF_VALUES[1]; value >= RANGE_OF_VALUES[0]; value-- {
		if frequency[value] == 1 {
			return value
		}
	}

	return NO_UNIQUE_INT_FOUND
}
