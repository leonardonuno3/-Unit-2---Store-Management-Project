public class Pastry extends MenuItem {
    private String pastryType;
    private boolean isGlutenFree;

    public Pastry() {
        super();
        pastryType = "Unknown";
        isGlutenFree = false;
    }

    public Pastry(String itemName, int itemID,
                  double price, int quantityAvailable,
                  String pastryType, boolean isGlutenFree) {
        super(itemName, itemID, price, quantityAvailable);
        this.pastryType = pastryType;
        this.isGlutenFree = isGlutenFree;
    }

    public String getPastryType() {
        return pastryType;
    }

    public boolean getIsGlutenFree() {
        return isGlutenFree;
    }

    public void setPastryType(String pastryType) {
        this.pastryType = pastryType;
    }

    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    public String toString() {
        return super.toString()
            + ", Pastry Type: " + pastryType
            + ", Gluten-Free: " + isGlutenFree;
    }
}
