public class LinkedList<T> {
    private Node<T> root;
    private int size;
    private int maxSize;

    public LinkedList() {
        this.maxSize = Integer.MAX_VALUE;
    }

    public LinkedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(T element) {
        if (size >= maxSize) {
            throw new ListSizeExceededException("Превышен максимальный размер списка: " + maxSize);
        }
        if (root == null) {
            root = new Node<>(element);
        } else {
            Node<T> lastNode = findLast();
            lastNode.setNext(new Node<>(element));
        }
        size++;
    }

    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new ElementNotFoundException("Неверный индекс: " + index);
        }
        if (size >= maxSize) {
            throw new ListSizeExceededException("Превышен максимальный размер списка: " + maxSize);
        }
        if (index == 0) {
            Node<T> newNode = new Node<>(element);
            newNode.setNext(root);
            root = newNode;
        } else {
            Node<T> previous = root;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            Node<T> newNode = new Node<>(element);
            newNode.setNext(previous.getNext());
            previous.setNext(newNode);
        }
        size++;
    }

    private Node<T> findLast() {
        if (root == null) {
            return null;
        }
        Node<T> lastNode = root;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        return lastNode;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ElementNotFoundException("Элемента с индексом " + index + " не существует");
        }
        Node<T> currentNode = root;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getValue();
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ElementNotFoundException("Элемента с индексом " + index + " не существует");
        }
        if (index == 0) {
            root = root.getNext();
        } else {
            Node<T> previous = root;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            previous.setNext(previous.getNext().getNext());
        }
        size--;
    }

    public int size() {
        return size;
    }
}
