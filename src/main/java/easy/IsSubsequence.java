/**
 * date       : 2022/6/28 下午 01:25
 * description:
 */
package easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
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
