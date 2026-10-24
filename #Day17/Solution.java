class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for(int i = 0;i<nums.length; i++){
            if (nums[i]<min) min= nums[i];
            if (nums[i]>max) max= nums[i];
        }
        int[] count = new int[max - min + 1];
        for (int i=0; i<nums.length; i++){
            count[nums[i]-min]++;
        }
        int[] result = new int[k];
        int index = 0;        
        for (int i=0;i<k;i++){
            int maxFreq = -1;
            int maxVal = -1;            
            for (int j = 0;j <count.length; j++) {
                if (count[j] > maxFreq) {
                    maxFreq = count[j];
                    maxVal = j + min;
                }
            }            
            result[index++] = maxVal;
            count[maxVal - min] = -1; 
            }

        return result;
    }
}