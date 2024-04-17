package PR2;

public class Product {
    String name;
    double price;
    double discount;
    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;

    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.discount = 0;
    }
    public double importtax() {
        return this.price * 0.1;

    }
    public void details() {
        System.out.println("name:" + this.name + " "
                            + "price:" + this.price + " " + "discount:" + this.discount + " " + "tax:" + this.importtax());
    }



}



