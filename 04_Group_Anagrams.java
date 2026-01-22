class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26]; // cuz 26 letters
            for (char c : s.toCharArray()) {
                count[c - 'a']++; // count occurrances
            }
        String key = Arrays.toString(count);
        System.out.println(key);
        result.putIfAbsent(key, new ArrayList<>());
        result.get(key).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
