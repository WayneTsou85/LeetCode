/**
 * date       : 2022/6/28 上午 09:29
 * description:
 */
package easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> stringMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (stringMap.containsKey(s.charAt(i))) {
                if (stringMap.get(s.charAt(i)) != t.charAt(i)) return false;
            } else {
                if (stringMap.containsValue(t.charAt(i))) return false;
                stringMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
