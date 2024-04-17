package PR2.tut11.tut11.product;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;
    private Type type;

public Product(String name, double price, Type type) {
    if(validatename(name)) {
        this.name = name;

    } else {
        throw new RuntimeException("ten lord a");
    }
    if(validateprice(price)) {
        this.price = price;

    } else {
        throw new RuntimeException("???? tien");
    }

    this.type = type;
}

    private boolean validatename(String name){
        return name.length()> 1 && name.length() <50;
    }
    private boolean validateprice(double price){
        return price > 0.0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
    if(validatename(name)) {
        this.name = name;

    } else {
        throw new RuntimeException("Ten ko hop le bn oi");
    }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(validateprice(price)) {
            this.price = price;
        } else {
            throw new RuntimeException("Gia troll a");
        }
    }

    public Type getType() {
        return type;
    }







}
