/*
The idea is to put(do some swap!) values that appears in the array in the corresponding 
positions(which is value-1), and then iterate through the array again and if the 
value doesn't match the index(EX:the value for index 2 should be 3), then index+1 didn't appear. 
Push it into the vector.
*/
class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        
        vector<int> res;
        if(nums.empty())
            return res;
        for(int i = 0; i < nums.size();)
        {
            if(nums[i] != nums[nums[i]-1])
                swap(nums[i],nums[nums[i]-1]);
            else 
                i++;
        }

        for(int i = 0; i < nums.size(); ++i)
        {
            if(nums[i] != i + 1)
                res.push_back(i+1);
        }
        return res; 
    }
};
