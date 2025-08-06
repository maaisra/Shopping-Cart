package Lib;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import Lib.Discount.DiscountStrategy;

public class PricingService {
    
    // Rep
    Dictionary<String, DiscountStrategy> pricingservice;

    public PricingService(){
        pricingservice = new Hashtable<>();
    }

    public void addStrategy(String sku, DiscountStrategy strategy){
        pricingservice.put(sku, strategy);
    }
    
    public double calculateItemPrice(CartItem item){
        Enumeration<String> k = pricingservice.keys();
        while (k.hasMoreElements()) {
            String key = k.nextElement();
            if (key == item.getProduct().getProductID()) {
                return pricingservice.get(key).calculatePrice(item);
            } else {
                return item.getProduct().getPrice() * item.getQuantity();
            }
        }
        return 0;
        
    }
}
