package info.everybodylies.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static info.everybodylies.nio.FileHelper.format;

public class ListClass {

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        printListResult(integerList);
        format("");
        printListResult(new LinkedList<>(integerList));
    }

    private static void printListResult(List<Integer> list) {
        format("%s -> Исходный список (%s)", list, list.getClass().getSimpleName());
        format("%s -> add(55) -> %s", list, list.add(55));
        format("%s -> addAll(Arrays.asList(200, 201)) -> %s", list, list.addAll(Arrays.asList(200, 201)));
        format("%s -> addAll(list.size(), Arrays.asList(300, 301)) -> %s", list, list.addAll(list.size(), Arrays.asList(300, 301)));
        format("%s -> contains(300) -> %s",list, list.contains(300));
        format("%s -> get(7) -> %s",list, list.get(7));
        format("%s -> indexOf(new Object) -> %s",list, list.indexOf(new Object()));
        format("%s -> indexOf(new Integer(200)) -> %s",list, list.indexOf(new Integer(200)));
        format("%s -> isEmpty() -> %s",list, list.isEmpty());
        format("%s -> iterator() -> %s",list, list.iterator());
        format("%s -> listIterator() -> %s",list, list.listIterator());
        format("%s -> remove(5) -> %s",list, list.remove(5));
        format("%s -> remove(new Integer(1)) -> %s",list, list.remove(new Integer(1)));
        format("%s -> removeAll(Arrays.asList(0, 2, 3)) -> %s",list, list.removeAll(Arrays.asList(0, 2, 3)));
        format("%s -> retainAll(Arrays.asList(200, 201, 300)) -> %s",list, list.retainAll(Arrays.asList(200, 201, 300)));
        format("%s -> set(2, 500) -> %s",list, list.set(2, 500));
        format("%s -> size() -> %s",list, list.size());
        format("%s -> subList(1/*inclusive*/, 3/*exclusive*/) -> %s",list, list.subList(1, 3));
        format("%s -> toArray() -> %s",list, list.toArray());
        format("%s -> toArray(new Integer[3] -> %s",list, list.toArray(new Integer[3]));
        if (list instanceof ArrayList) {
            ((ArrayList) list).trimToSize();
        }
    }
}
