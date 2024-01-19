package easy;

public class NumberOfRecentCalls {

    private final RecentCounter counter = new RecentCounter();
    public int solution(int t) {
        return counter.ping(t);
    }

}
class RecentCounter {

    private int[] queue;

    public RecentCounter() {
        queue = new int[]{};
    }

    public int ping(int t) {
        int size = queue.length;
        int[] temp = new int[size + 1];
        System.arraycopy(queue, 0, temp, 0, size);
        temp[size] = t;
        queue = temp;
        int left = t - 3000;
        int counter = 0;
        for (int current : queue) {
            if (current >= left && current <= t) counter++;
        }
        return counter;
    }
}
