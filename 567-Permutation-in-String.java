class Solution {
    public boolean checkInclusion(String p, String s) {
         List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int k = p.length();
        if (n < k)
            return false;
        HashMap<Character, Integer> pMap = new HashMap<>();
        for (int i=0;i<k;i++)
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (pMap.equals(sMap)) {
            return true;
        }
        for (int i = k; i < n; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0) + 1);
            sMap.put(s.charAt(i - k), sMap.get(s.charAt(i - k)) - 1);
            if (sMap.get(s.charAt(i - k)) == 0)
                sMap.remove(s.charAt(i - k));
            if (pMap.equals(sMap))
                return true;
        }
        return false;
    }
}