public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("возраст", 20);
        System.out.println(pair.getKey() + ": " + pair.getValue());
        pair.setValue(21);
        System.out.println(pair);

        Pair<Integer, String> pair2 = new Pair<>(1, "один");
        System.out.println(pair2);
    }
}
