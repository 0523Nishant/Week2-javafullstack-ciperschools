import java.util.ArrayList;

public class Test2 {

    // Write aJava Program to Ask user if he/she wants to add Item
    // in shoppin Cart
    // item : product Titel and Price
    // show the total Product Name in ascending order
    // total Amount of All Products.

    // add More ? y , add More ? N
    // Total Bill : XX
    // Products List(ascending order)
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();
        Product p = new Product();
        p.title = "xmen";
        p.price = 333;
        products.add(p);
    }
}

class Product {
    String title;
    int price;
}
