package easy;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] word1CharArray = word1.toCharArray();
        char[] word2CharArray = word2.toCharArray();
        int word1Length = word1CharArray.length;
        int word2Length = word2CharArray.length;
        int min = Math.min(word1Length, word2Length);
        char[] result = new char[word1Length + word2Length];
        int pointer = 0;
        for (int index = 0; index < min; index++) {
            result[pointer] = word1CharArray[index];
            result[pointer + 1] = word2CharArray[index];
            pointer += 2;
        }
        if (word1Length > word2Length) {
            word1.getChars(min, word1Length, result, min * 2);
        } else {
            word2.getChars(min, word2Length, result, min * 2);
        }
        return new String(result);
    }

}
