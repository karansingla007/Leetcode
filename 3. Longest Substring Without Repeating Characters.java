class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0 || n == 1) {
            return n;
        }
        int start = 0, end = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        while(end < n && start <= end) {
            if(map.containsKey(s.charAt(end))) {
                max = Math.max(max, (end - start));
                while(s.charAt(end) != s.charAt(start)) {
                    map.remove(s.charAt(start));
                    start++;
                }
                map.remove(s.charAt(start));
                map.put(s.charAt(end), 1);
                start++;
            } else {
                map.put(s.charAt(end), 1);
            }
            end++;
        }
        max = Math.max(max, map.size());
        return max;
    }
}