class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // For 26 lowercase English letters

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // increment count for s
            count[t.charAt(i) - 'a']--;  // decrement count for t
        }

        for (int c : count) {
            if (c != 0) return false;    // mismatch in letter count
        }

        return true;
    }
}
