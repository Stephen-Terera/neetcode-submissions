class Solution {
    public int[] getConcatenation(int[] nums) { 
        int arrayLength = nums.length;
        int[] ans = Arrays.copyOf(nums, arrayLength *2);
        for (int i = 0; i < arrayLength; i++){
            ans[arrayLength + i] = nums[i];
        }
        return ans; 
    }
}