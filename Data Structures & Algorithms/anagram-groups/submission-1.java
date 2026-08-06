class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outputList = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs){
            char [] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String (chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

        }

        outputList.addAll(map.values());
        return outputList;
      
}
}
