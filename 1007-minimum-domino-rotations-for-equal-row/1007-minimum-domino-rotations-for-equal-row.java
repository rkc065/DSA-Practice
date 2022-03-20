class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        if (tops.length != bottoms.length) { return -1; }
        int[] countA = new int[7]; // countA[i] records the occurrence of i in A.
        int[] countB = new int[7]; // countB[i] records the occurrence of i in B.
        int[] same = new int[7]; // same[k] records the occurrence of k, where k == A[i] == B[i].
        for (int i = 0; i < tops.length; ++i) {
            ++countA[tops[i]];
            ++countB[bottoms[i]];
            if (tops[i] == bottoms[i]) { ++same[tops[i]]; }
        }
        for (int i = 1; i < 7; ++i) {
            if (countA[i] + countB[i] - same[i] == tops.length) {
                return Math.min(countA[i], countB[i]) - same[i];
            }
        }
        return -1;
    }
}