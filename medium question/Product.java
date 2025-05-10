//Product Discount Calculator Create a class Product with productName, price, and discountPercentage. Write a method calculateFinalPrice() which returns price after discount. Create 3 different products and print their final prices.
public class Product {
    String productName;
    float price;
    int discountPercentage;

    Product(String productName,float price, int discountPercentage ){
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    float calculateFinalPrice(){
        return price - price * discountPercentage/100;
    }

    public static void main(String[] args) {
        Product p1 = new Product("chips", 200, 10);
        System.out.println(p1.calculateFinalPrice());
    }


}
