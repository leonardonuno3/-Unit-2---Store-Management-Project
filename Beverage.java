public class Beverage extends MenuItem {
    private String size;
    private String temperature;

    public Beverage() {
        super();
        size = "Medium";
        temperature = "Hot";
    }

    public Beverage(String itemName, int itemID,
                    double price, int quantityAvailable,
                    String size, String temperature) {
        super(itemName, itemID, price, quantityAvailable);
        this.size = size;
        this.temperature = temperature;
    }

    public String getSize() {
        return size;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return super.toString()
            + ", Size: " + size
            + ", Temperature: " + temperature;
    }
}
