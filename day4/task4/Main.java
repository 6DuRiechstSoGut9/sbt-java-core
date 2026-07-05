public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("Размер списка: " + list.size());
        System.out.println("Элемент 1: " + list.get(1));

        list.add(1, "x");
        System.out.println("После вставки по индексу 1: " + list.get(1));
        System.out.println("Размер: " + list.size());

        list.remove(0);
        System.out.println("После удаления элемента 0: " + list.get(0));

        try {
            list.get(100);
        } catch (ElementNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            list.add(100, "y");
        } catch (ElementNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        LinkedList<Integer> limited = new LinkedList<>(2);
        limited.add(1);
        limited.add(2);
        try {
            limited.add(3);
        } catch (ListSizeExceededException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
