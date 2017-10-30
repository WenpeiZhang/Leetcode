/*RushRab:
The idea is very similar to problem 442. 
Find All Duplicates in an Array: https://leetcode.com/problems/find-all-duplicates-in-an-array/.

First iteration to negate values at position whose equal to values appear in array. 
Second iteration to collect all position whose value is positive, which are the missing values. 
Complexity is O(n) Time and O(1) space.
*/
class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int len = nums.size();
        for(int i=0; i<len; i++) {
            int m = abs(nums[i])-1; // index start from 0
            nums[m] = nums[m]>0 ? -nums[m] : nums[m];
        }
        vector<int> res;
        for(int i = 0; i<len; i++) {
            if(nums[i] > 0) res.push_back(i+1);
        }
        return res;
    }
};
