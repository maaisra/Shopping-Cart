package Lib;

public final class Product {

     // Rep
     private final String productID;
     private final String productName;
     private final double price;

     // Rep Invariant (RI):
     // productID and productName must not null or blank.
     // price must not be negative number.

     // Constructor
     public Product(String productID, String productName, Double price){
          this.productID = productID;
          this.productName = productName;
          this.price = price;
          CheckRep();
     }

     public String getProductID(){
          return productID;
     }

     public String getProductName(){
          return productName;
     }

     public double getPrice(){
          return price;
     }

     // ตรวจสอบ RI
     private void CheckRep(){
          if ((productID == null || productID == "") && (productName == null || productID == "")) {
               throw new RuntimeException("Rep invariant violated!");
          }
          if (price < 0) {
               throw new RuntimeException("Rep invariant violated!");
          }
     }

     public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return productID == other.productID && productID.equals(other.productID);
     }

}
