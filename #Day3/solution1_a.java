class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        
        int temp[] = new int[2];
        for(int i=0; i<len;i++){
            for(int j=i+1;j<len;j++){
                if (nums[i] + nums[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                }
            }
        
        }
    return temp;    
    }
}