#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void nextPermutation(vector<int> &nums)
{
    next_permutation(nums.begin(), nums.end()); // using in-built function of C++
    for (int n : nums)
    {
        cout << n << " ";
    }
    cout << endl;
}
int main()
{
    vector<int> arr = {1, 3, 2};
    nextPermutation(arr);
}
