package class30MapsEntry;

import java.util.LinkedHashSet;
import java.util.Set;

class Entry {
    int key;
    String value;

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }


}

public class EntryDemo6 {

    public static void main(String[] args) {
        Set<Entry> entries = new LinkedHashSet<>();

        entries.add(new Entry(1, "Ned"));
        entries.add(new Entry(2, "Fred"));
        entries.add(new Entry(4, "Lead"));
        entries.add(new Entry(5, "Freddy"));
        entries.add(new Entry(3, "Sed"));

        //remove objects where the key is greater than 2 and value has letter 'e'
        //"x" is an object of Entry
        entries.removeIf(x -> x.getKey() > 2 && x.getValue().contains("e"));

    }
}