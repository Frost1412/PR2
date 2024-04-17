package PR2.tut11;

import PR2.tut11.tut11.product.Product;
import PR2.tut11.tut11.product.Type;

public class TestDAO {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();

        productDAO.add(new Product("Laptop", 999.99, Type.HOUSE));
        productDAO.add(new Product("Phone", 499.99, Type.KITCHEN));
        productDAO.add(new Product("Tablet", 299.99, Type.OPTIMUS));

        Product updatedProduct = new Product("Phone", 599.99, Type.PRIME);
        productDAO.update(updatedProduct);

        // Find a product
        String productName = "Phone";
        Product foundProduct = productDAO.find(productName);
        if (foundProduct != null) {
            System.out.println("Found product: " + foundProduct.getName() + ", Price: " + foundProduct.getPrice()  + ", Type: " + foundProduct.getType());
        } else {
            System.out.println("Product with name " + productName + " not found.");
        }
    }
}
