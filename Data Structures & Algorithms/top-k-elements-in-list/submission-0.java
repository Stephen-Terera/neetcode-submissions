class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counters = new HashMap<>();
        int[] answers = new int[k];

        for (int num: nums){
            counters.put(num, counters.getOrDefault(num,0) +1);
        }
        for (int i = 0; i < k; i++) {
            int maxFreq = Collections.max(counters.values());
            for (Map.Entry<Integer, Integer> entry : counters.entrySet()) {
                if (entry.getValue() == maxFreq) {
                    answers[i] = entry.getKey();
                    counters.remove(entry.getKey());
                    break;
                }
            }
        }
        
        return answers;
         
        
    }
}
