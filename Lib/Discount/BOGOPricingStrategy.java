package Lib.Discount;
import Lib.CartItem;

public class BOGOPricingStrategy implements DiscountStrategy{

    @Override
    public double calculatePrice(CartItem item) {
        if (item.getQuantity() %2 == 0) { // คัดกรณีที่เป็นซื้อของเป็นจำนวนคู่
            return (item.getQuantity()/2 * item.getProduct().getPrice());
        } else return ((item.getQuantity()+1)/2 * item.getProduct().getPrice()); // คัดกรณีที่เป็นซื้อของเป็นจำนวนคี่
    }
    
}
