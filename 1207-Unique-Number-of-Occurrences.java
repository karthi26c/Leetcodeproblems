class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int x:arr) {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        HashSet<Integer> s=new HashSet<>();
        for(int x:map.values()) {
            if(!s.add(x)){
                return false;
            }
        }
        return true;
    }
}