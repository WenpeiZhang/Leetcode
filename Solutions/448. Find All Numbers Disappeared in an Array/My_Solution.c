/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize) {
    int* disarray = (int*)malloc(sizeof(int)*(*returnSize));
    int n=0;
    int flag;
    for(int i = 1;i<=numsSize;i++){
         flag=0;
        for(int j = 0;j<numsSize;j++)//iterate through the array to see if the value is in there
        {
            if(nums[j]==i)
                flag=1;
        }
        if(flag == 0)
        {
            disarray[n]=i;
            n++;
        }
            
    }
    return disarray;
}
