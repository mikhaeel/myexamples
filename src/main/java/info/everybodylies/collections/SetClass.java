package info.everybodylies.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static info.everybodylies.nio.FileHelper.format;

public class SetClass {

    public static void main(String[] args) {
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(0);
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);
        printSet(integerHashSet);
        format("");
        Set<Integer> integerLinkedHashSet = new HashSet<>();
        integerLinkedHashSet.add(0);
        integerLinkedHashSet.add(1);
        integerLinkedHashSet.add(2);
        integerLinkedHashSet.add(3);
        printSet(integerLinkedHashSet);
    }

    private static void printSet(Set<Integer> set) {
        format("%s -> Исходный Set", set);
        format("%s -> add(100) -> %s", set, set.add(100));
        format("%s -> add(100) -> %s", set, set.add(100));
        format("%s -> addAll(Arrays.asList(100, 101)) -> %s", set, set.addAll(Arrays.asList(100, 101)));
        format("%s -> addAll(Arrays.asList(100, 101)) -> %s", set, set.addAll(Arrays.asList(100, 101)));
        format("%s -> contains(new Object()) -> %s", set, set.contains(new Object()));
        format("%s -> contains(new Integer(100)) -> %s", set, set.contains(new Integer(100)));
        format("%s -> containsAll(Arrays.asList(0, 3, 100)) -> %s", set, set.containsAll(Arrays.asList(0, 3, 100)));
        format("%s -> equals(new Object()) -> %s", set, set.equals(new Object()));
        format("%s -> equals(set) -> %s", set, set.equals(set));
        format("%s -> hashCode() -> %s", set, set.hashCode());
        format("%s -> iterator() -> %s", set, set.iterator());
        format("%s -> remove(new Integer(3)) -> %s", set, set.remove(new Integer(3)));
        format("%s -> remove(new Integer(3)) -> %s", set, set.remove(new Integer(3)));
        format("%s -> removeAll(Arrays.asList(0, 1)) -> %s", set, set.removeAll(Arrays.asList(0, 1)));
        format("%s -> removeAll(Arrays.asList(0, 1)) -> %s", set, set.removeAll(Arrays.asList(0, 1)));
        format("%s -> retainAll(Arrays.asList(100, 25)) -> %s", set, set.retainAll(Arrays.asList(100, 25)));
        format("%s -> retainAll(Arrays.asList(100, 25)) -> %s", set, set.retainAll(Arrays.asList(100, 25)));
        format("%s -> size() -> %s", set, set.size());
        format("%s -> toArray() -> %s", set, set.toArray());
        format("%s -> toArray(new Integer[2]) -> %s", set, set.toArray(new Integer[2]));
    }
}
