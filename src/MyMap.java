import java.util.*;

public class MyMap<K, V> {
    private Set<MyEntry<K, V>> myEntrySet;


    MyMap() {
        this.myEntrySet = new HashSet<>();
    }

    public void addNewObject(String k, Integer v) {
        myEntrySet.add((MyEntry<K, V>) new MyEntry<>(k, v));
    }

    public void removeObjectWithKey(String key) {
        Iterator<?> iterator = myEntrySet.iterator();
        while (iterator.hasNext()) {
            MyEntry<K, V> myEntry = (MyEntry<K, V>) iterator.next();
            if (myEntry.getKey().toString().equals(key)) {
                iterator.remove();
            } else {
                System.out.println("Object not found!");
            }

        }
    }

    public void removeObjectWithValue(Integer val) {
        for (MyEntry<K, V> myEntry : myEntrySet) {
            if (myEntry.getValue().equals(val)) {
                myEntry.setValue(null);
            } else {
                System.out.println("Object have not value!");
            }

        }
        System.out.println("_______________");
    }

    public void printSetKey() {
        for (MyEntry<K, V> myEntry : myEntrySet) {
            Set<K> setKey = new HashSet<>();
            setKey.add(myEntry.getKey());
            for (K k : setKey) {
                System.out.print(k + ", ");
            }

        }
    }

    public void printListVal() {
        for (MyEntry<K, V> myEntry : myEntrySet) {
            List<V> listVal = new ArrayList<>();
            listVal.add(myEntry.getValue());
            for (V v : listVal) {
                System.out.println(v + ", ");
            }
            System.out.println("_______________");
        }
    }

    public void printAllSet() {
        for (MyEntry<K, V> myEntry : myEntrySet) {
            System.out.print(myEntry + ", ");
        }


    }
}
