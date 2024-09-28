public class Product {
    String name;
    Double Price;
    int stock;

    public Product( String name, Double price, int stock) {
        this.name = name;
        Price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                ", stock=" + stock +
                '}';
    }
}
