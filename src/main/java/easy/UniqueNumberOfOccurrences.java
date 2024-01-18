package easy;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int current = map.getOrDefault(i, 0);
            current = current + 1;
            map.put(i, current);
        }
        return map.keySet().size() == new HashSet<>(map.values()).size();
    }

}
