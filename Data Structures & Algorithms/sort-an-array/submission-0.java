class Solution {
    public int[] sortArray(int[] nums) {

        PriorityQueue<Integer> sortedNums = new PriorityQueue<>();
        for (int num: nums){
            sortedNums.add(num);
        }

        int[] answer = new int[sortedNums.size()];
        int counter = 0;
        while(!sortedNums.isEmpty()){
            answer[counter++] = sortedNums.poll();
        }
        return answer;
    }
}