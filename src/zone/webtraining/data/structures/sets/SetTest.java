package zone.webtraining.data.structures.sets;

import java.util.Set;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String... args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(-2);
        set.add(3);
        set.add(-10);
        set.add(-100);

        System.out.println(set);
    }
}
