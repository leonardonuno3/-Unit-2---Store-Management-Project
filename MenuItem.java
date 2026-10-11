public class MenuItem {
    private String itemName;
    private int itemID;
    private double price;
    private int quantityAvailable;

    public MenuItem() {
        itemName = "Unknown";
        itemID = 0;
        price = 0.0;
        quantityAvailable = 0;
    }

    public MenuItem(String itemName, int itemID,
                    double price, int quantityAvailable) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemID() {
        return itemID;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String toString() {
        return "Item: " + itemName
            + ", ID: " + itemID
            + ", Price: $" + String.format("%.2f", price)
            + ", Quantity: " + quantityAvailable;
    }
}
