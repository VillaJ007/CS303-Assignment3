import java.util.ArrayList;

public class RecursiveSearch {

    // Public method that starts the recursive search from the last index
    public static int findLastOccurrence(ArrayList<Integer> list, int target) {
        return findLastOccurrence(list, target, list.size() - 1);
    }

    // Recursive helper method
    private static int findLastOccurrence(ArrayList<Integer> list, int target, int index) {
        if (index < 0) {
            return -1;
        }

        if (list.get(index) == target) {
            return index;
        }

        return findLastOccurrence(list, target, index - 1);
    }
}
