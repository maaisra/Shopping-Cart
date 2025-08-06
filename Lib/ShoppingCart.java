package Lib;

import java.util.ArrayList;

public class ShoppingCart {
    
    // Rep Invariant (RI):
    // ArrayList must not null
    // Same Product must not contain in Different CartItem

    ArrayList<CartItem> cartItems = new ArrayList<>();
    PricingService pricingService;
    ProductCatalog productCatalog;

    public ShoppingCart(){
        this.cartItems = new ArrayList<>();
        this.pricingService = new PricingService();
        this.productCatalog = new ProductCatalog();
        CheckRep();
    }
    public ShoppingCart(PricingService pricingService ,ProductCatalog productCatalog){
        this.pricingService = pricingService;
        this.productCatalog = productCatalog;
    }

    public void addItem(String producID, int quantity){
        
    }

    public void removeItem(String productID){
        
    }

    public double getTotalPrice(){
        double sum = 0;
        for (CartItem cartItem : cartItems) {
            sum += pricingService.calculateItemPrice(cartItem);
        }
        return sum;
    }

    /**
     * Method สำหรับการเช็กว่ามีจำนวนสินค้าในตะกร้าเท่าใด
     * @return จำนวนสินค้าทั้งหมด
     */

    public int getItemCount(){
        return cartItems.size();
    }

    /**
     * Method สำหรับการเคลียร์ข้อมูลสินค้าทั้งตะกร้า
     */

    public void clearCart(){
        cartItems.clear();
    }
    
    private void CheckRep(){
        if (cartItems == null) {
            throw new RuntimeException("Rep invariant violated!");
        }
        
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().equals(cartItem.getProduct())) 
            throw new RuntimeException("Rep invariant violated!");
        }
    }
}
