class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

abstract class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Product price must be greater than zero.");
        }
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateDiscount();

    public double calculateFinalPrice() {
        return price - calculateDiscount();
    }
}

class Electronics extends Product {
    public Electronics(String productId, String productName, double price) throws InvalidPriceException {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
}

class Clothing extends Product {
    public Clothing(String productId, String productName, double price) throws InvalidPriceException {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
}

class Grocery extends Product {
    public Grocery(String productId, String productName, double price) throws InvalidPriceException {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        try {
            Product[] products = new Product[] {
                new Electronics("E101", "Laptop", 50000.0),
                new Clothing("C102", "Jacket", 3000.0),
                new Grocery("G103", "Rice Bag", 1000.0)
            };

            for (Product p : products) {
                System.out.println("Product ID: " + p.getProductId());
                System.out.println("Product Name: " + p.getProductName());
                System.out.println("Original Price: " + p.getPrice());
                System.out.println("Discount Amount: " + p.calculateDiscount());
                System.out.println("Final Price: " + p.calculateFinalPrice());
                System.out.println();
            }

            Product invalidProduct = new Electronics("E104", "Invalid Item", -500.0);

        } catch (InvalidPriceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Product processing completed");
        }
    }
}