
#include <array>
#include <vector>
using namespace std;

class Solution {

    static constexpr array<int, 2> RANGE_OF_VALUES = { 0, 1000 };
    static const int NO_UNIQUE_INT_FOUND = -1;

public:
    int largestUniqueNumber(const vector<int>& input) const{
    array<int, RANGE_OF_VALUES[1] + 1> frequency{};
    for (const auto& value : input) {
        ++frequency[value];
    }

    for (int value = RANGE_OF_VALUES[1]; value >= RANGE_OF_VALUES[0]; --value) {
        if (frequency[value] == 1) {
            return value;
        }
    }

    return NO_UNIQUE_INT_FOUND;
    }
};
