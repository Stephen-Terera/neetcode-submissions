class Solution {
    public int[] topKFrequent(int[] nums, int k) {
HashMap<Integer, Integer> counters = new HashMap<>();
int[] answers = new int[k];

for (int num : nums) {
    counters.put(num, counters.getOrDefault(num, 0) + 1);
}

PriorityQueue<Map.Entry<Integer,Integer>> freqs = 
    new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

for (Map.Entry<Integer,Integer> entry : counters.entrySet()) {
    freqs.offer(entry);
    if (freqs.size() > k) {
        freqs.poll();
    }
}

for (int i = k - 1; i >= 0; i--) {
    answers[i] = freqs.poll().getKey();
}

return answers;
         
        
    }
}
