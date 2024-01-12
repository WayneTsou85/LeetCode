package easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        List<String> tempArray = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (isVowels(c)) {
                tempArray.add(String.valueOf(c));
            }
        }
        int tempIndex = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            char target = charArray[i];
            if (isVowels(target)) {
                String element = tempArray.get(tempIndex);
                charArray[i] = element.toCharArray()[0];
                tempIndex++;
            }
        }
        return new String(charArray);
    }

    private boolean isVowels(char target) {
        return target == 'a' || target == 'e'|| target == 'i'|| target == 'o'|| target == 'u'
                || target == 'A' || target == 'E'|| target == 'I'|| target == 'O'|| target == 'U';
    }
}
