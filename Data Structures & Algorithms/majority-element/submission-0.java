class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int bestKey = count.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .get()
            .getKey();

        return bestKey;
        
    }
}