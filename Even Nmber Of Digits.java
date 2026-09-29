class Solution {
    public int findNumbers(int[] a) {
        int total = 0;
        for (int b : a) {
            int c = 0;
            while (b > 0) {
                c++;
                b = b / 10;
            }
            if (c % 2 == 0) {
                total++;
            }
        }
        return total;
    }
}