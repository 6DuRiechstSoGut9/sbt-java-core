public class PizzaOrder {
    String name;
    Size size;
    boolean needSauce;
    String address;
    boolean accepted;

    public PizzaOrder(String name, Size size, boolean needSauce, String address) {
        this.name = name;
        this.size = size;
        this.needSauce = needSauce;
        this.address = address;
    }

    public void order() {
        if (accepted) {
            System.out.println("Заказ уже принят");
        } else {
            accepted = true;
            System.out.println("Заказ принят. " + this);
        }
    }

    public void cancel() {
        if (accepted) {
            accepted = false;
            System.out.println("Заказ отменен");
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isNeedSauce() {
        return needSauce;
    }

    public void setNeedSauce(boolean needSauce) {
        this.needSauce = needSauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        String sauce = needSauce ? "с соусом" : "без соуса";
        return size.title + " пицца «" + name + "» " + sauce + " на адрес " + address;
    }
}
