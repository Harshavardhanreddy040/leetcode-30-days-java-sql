class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        boolean isOdd = false;
        int rez = 0;

        for (char ch : s.toCharArray()) {
            arr[ch]++;
        }

        for (int count : arr) {
            if (count % 2 == 0) {
                rez += count;
            } else {
                isOdd = true;
                rez += count - 1;
            }
        }

        if (isOdd) {
            rez += 1;
        }

        return rez;
    }
}
