class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        int k = 0;
        for(i=1;i<nums.length;i++){
            
            if (nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
                
            }
           
            
        }
        return k+1;
    }
}