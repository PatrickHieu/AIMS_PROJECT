public class Cart {
    private final DigitalVideoDisc[] items = new DigitalVideoDisc[20];
    private int itemOrdered = 0;

    // Create DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemOrdered < 20) {
            items[itemOrdered] = disc;
            itemOrdered++;
            System.out.println("Completed Added DVD");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    // Delete DVD out of Cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < itemOrdered; i++) {
            if (items[i] == disc) {
                for (int j = i; j < itemOrdered - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[itemOrdered - 1] = null;
                itemOrdered--;
                System.out.println("Complete Removed DVD");
                return;
            }
        }
        System.out.println("Could not find the DVD");
    }

    // Total Cost
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemOrdered; i++) {
            total += items[i].getCost();
        }
        return total;
    }
}
