package day2.task4;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Джошуа Блох", "мужской", "bloch@java.com");
        Book book = new Book("Effective Java", author, 2018);
        System.out.println(book);
        book.setYear(2020);
        System.out.println("Год после изменения: " + book.getYear());
        System.out.println("Автор: " + book.getAuthor().getName());
    }
}
