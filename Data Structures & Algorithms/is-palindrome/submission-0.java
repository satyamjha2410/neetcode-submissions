class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println("s1: " + s1);
        int l = s1.length();
        for (int i = 0; i < l / 2; i++) {
            char c1 = s1.charAt(i);
            char c2 = s1.charAt(l - i - 1);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}
