package homework1;

public class Product {
    String product;
    int qty;
    double price;
    double total;

    public Product() {
    }

    public void yardSaleWholeSale(String product,double price, int qty){
        double total = price * qty;
        System.out.println(String.format("%-8s %-8s $%-7.1f $%.2f", product, qty, price, total ));
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return  product+ " " + qty +" "  + price +" "+ total;
    }
}
