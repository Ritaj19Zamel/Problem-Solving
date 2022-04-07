class Solution {
   public  int removeDuplicates(int[] nums) {
       if(nums.length ==0 || nums.length ==1)
       {
           return nums.length;
       }
        int k = 0;
        for(int i=0 ;i <nums.length;i++)
        {
            if(nums[k] != nums[i])
                nums[++k]=nums[i];
        }

        return k+1;
    }
}
