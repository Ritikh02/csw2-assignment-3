class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class A3Q1 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<String, Double> pair2 = new Pair<>("Pi", 3.14159);
        System.out.println("Pair 1: Key = " + pair1.getKey() + ", Value = " + pair1.getValue());
        System.out.println("Pair 2: Key = " + pair2.getKey() + ", Value = " + pair2.getValue());
    }
}
