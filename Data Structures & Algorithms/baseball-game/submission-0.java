class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> record = new ArrayDeque<>();
        for (String op : operations) {
            switch (op) {
                case "+" -> {
                    int last = record.pop();             
                    int sum = last + record.peek();      
                    record.push(last);                   
                    record.push(sum);
                }
                case "D" -> record.push(record.peek() * 2);
                case "C" -> record.pop();
                default  -> record.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int score : record) total += score;
        return total;
    }
}