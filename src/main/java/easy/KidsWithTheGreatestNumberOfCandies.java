package easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int index = 0; index < candies.length; index++) {
            int totalCandies = candies[index] + extraCandies;
            boolean currentResult = true;
            for (int subIndex = 0; subIndex < candies.length; subIndex++) {
                if (index == subIndex) continue;
                if (!currentResult) break;
                currentResult = totalCandies >= candies[subIndex];
            }
            result.add(currentResult);
        }
        return result;
    }
}
