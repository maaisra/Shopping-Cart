package Lib.Discount;
import Lib.CartItem;

public class BulkPricingStrategy implements DiscountStrategy {

    private final int minQuan;
    private final double Discountpercent;

    public BulkPricingStrategy(int minQuan, double Discountpercent){
        this.minQuan = minQuan;
        this.Discountpercent = Discountpercent;
    }

    @Override
    public double calculatePrice(CartItem item) {
        if (item.getQuantity() >= minQuan) {
            return (item.getQuantity() * item.getProduct().getPrice()) * (1.0 - Discountpercent);
        } else {
            return item.getProduct().getPrice() * item.getQuantity();
        }
    }
    
}
