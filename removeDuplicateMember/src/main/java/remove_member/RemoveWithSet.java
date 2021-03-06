package remove_member;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveWithSet {
    public static void main(String[] args) {
        Integer[] array = {2, 5, 3, 1, 3, 2, 1, 8, 5, 6};

        System.out.println(Arrays.toString(array));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(Arrays.asList(array));

        Integer[] withoutDuplicates = linkedHashSet.toArray(new Integer[]{});

        System.out.println(Arrays.toString(withoutDuplicates));
    }
}
