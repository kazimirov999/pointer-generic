
public class Main {
    public static void main(String[] args) {
        MyMap myMap = new MyMap();

        myMap.addNewObject("Dog", 3000);
        myMap.addNewObject("Cat", 2000);
        myMap.removeObjectWithKey("Dog");
        myMap.removeObjectWithValue(2000);
        myMap.printSetKey();
        myMap.printListVal();
        myMap.printAllSet();

    }
}
