package PR2.tut11.tut11.product;


import static PR2.tut11.tut11.product.Type.*;

public class testproduct   {

    public static void main(String[] args) {
        Product tivi  = new Product("Tivi", 123.23, HOUSE);

        System.out.println(       tivi.getType());
    }
}
