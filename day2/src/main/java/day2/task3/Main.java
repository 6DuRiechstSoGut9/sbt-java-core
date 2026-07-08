package day2.task3;

public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(2, 2);
        a.setValue(0, 0, 1);
        a.setValue(0, 1, 2);
        a.setValue(1, 0, 3);
        a.setValue(1, 1, 4);

        Matrix b = new Matrix(2, 2);
        b.setValue(0, 0, 5);
        b.setValue(0, 1, 6);
        b.setValue(1, 0, 7);
        b.setValue(1, 1, 8);

        System.out.println("Матрица A:");
        a.print();
        System.out.println("Матрица B:");
        b.print();

        System.out.println("Сумма матриц:");
        a.add(b).print();

        System.out.println("Умножение A на 2:");
        a.multiply(2).print();

        System.out.println("Произведение матриц:");
        a.multiply(b).print();
    }
}
