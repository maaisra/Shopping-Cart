package Lib;

import java.util.ArrayList;

public class ProductCatalog {

    // Rep
    ArrayList<Product> products;

    // Rep Invariant (RI):
    // Arraylist must not null nad Product must not the same things.

    public ProductCatalog(){
        products = new ArrayList<>();
    }

    private void CheckRep(){
        for (Product product : products) { // เช็ก null
            if (product == null) {
                throw new RuntimeException("Rep invariant violated!");
            }
        }
        // เช็กว่า Product ซ้ำกันหรือไม่
        if (products.equals(products)) throw new RuntimeException("Rep invariant violated!");
    }

    public void addProduct(Product product){
        products.add(product);
        CheckRep();
    }
    
    public Product findByID(String productID){
        for (Product product : products) {
            if (product.getProductID().equals(productID)) {
                return product;
            }
        }
        CheckRep();
        return null;
    }

}
