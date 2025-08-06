package Lib;

public class CartItem {

    //Rep
    private final Product product;
    private int quantity;

    // Rep Invariant (RI):
    // Product must not null
    // price must not be negative number.

    public CartItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
        CheckRep();
    }

    public Product getProduct(){
        return product;
    }

    public int getQuantity(){
        return quantity;
    }

    public void increaseQuantity(int amount){
        this.quantity += amount;
        CheckRep();
    }

    private void CheckRep(){
        if (product == null || quantity < 0) {
            throw new RuntimeException("Rep invariant violated!");
        }
    }
}
