package level1.extends1.ex;

public class Item {

    protected String name;
    protected int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
    }

    protected int getPrice() {
        return price;
    }
}
