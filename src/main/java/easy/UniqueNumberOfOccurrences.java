package easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Long> result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return result.keySet().size() == new HashSet<>(result.values()).size();
    }

}
