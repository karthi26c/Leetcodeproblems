class Solution {
    public int maximumUniqueSubarray(int[] a) {
        HashSet<Integer> st = new HashSet<>();
        int i = 0;
        int currSum = 0;
        int maxScore = 0;

        for (int j = 0; j < a.length; j++) {

            while (st.contains(a[j])) {
                st.remove(a[i]);
                currSum -= a[i];
                i++;
            }

            st.add(a[j]);
            currSum += a[j];

            maxScore = Math.max(maxScore, currSum);
        }

        return maxScore;
    }
}