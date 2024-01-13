package easy;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int largestAltitude = sum;
        for (int i : gain) {
            sum+=i;
            if (sum > largestAltitude) {
                largestAltitude = sum;
            }
        }
        return largestAltitude;
    }
}
