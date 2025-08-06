package Lib.Discount;
import Lib.CartItem;

public interface DiscountStrategy {
    public double calculatePrice(CartItem item);
}
