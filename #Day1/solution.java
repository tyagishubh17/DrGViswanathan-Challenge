class Solution {
    public int findNumbers(int[] nums) {
        int l = nums.length ;
        int count = 0;
        for(int i=0;i<l;i++){
            int len = String.valueOf(nums[i]).length();
            if (len % 2 == 0){
                count +=1;
            }
        }
    return count;
    }
}