package PR2.tut11;

import PR2.tut11.tut11.product.Product;

import java.io.Serializable;

public class ProductDAO extends DAO<Product> {

    public ProductDAO() {
        super();
    }






    @Override
    public boolean update(Product product) {
        for (int i = 0; i < lmao.size(); i++) {
            Product p = lmao.get(i);
            if (p.getName().equals(product.getName())) {
                lmao.set(i, product);
            }
        }
        return false;
    }

    @Override

    public Product find(Serializable id) {
        for (Product p : getList()) {
           if (p.getName().equals(id)) {
                return p;
            }
        }
        return null;
    }



}
