package easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        char[] refChar = s.toCharArray();
        int refIndex = 0;
        for (char c : t.toCharArray()) {
            if (refIndex >= s.length()) return true;
            if (c == refChar[refIndex]) {
                refIndex++;
            }
        }
        return refIndex == s.length();
    }
}
