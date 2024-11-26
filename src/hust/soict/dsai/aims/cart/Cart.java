package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

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

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (itemOrdered < 20) {
                items[itemOrdered] = dvd;
                itemOrdered++;
                System.out.println("Completed Added DVD: " + dvd.getTitle());
            } else {
                System.out.println("The cart is almost full.");
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (itemOrdered < 20) {
            items[itemOrdered] = dvd1;
            itemOrdered++;
            System.out.println("Completed Added DVD: " + dvd1.getTitle());
        } else {
            System.out.println("The cart is almost full.");
        }

        if (itemOrdered < 20) {
            items[itemOrdered] = dvd2;
            itemOrdered++;
            System.out.println("Completed Added DVD: " + dvd2.getTitle());
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    // Print list of hust.soict.dsai.aims.cart.Cart
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < itemOrdered; i++) {
            DigitalVideoDisc disc = items[i];
            System.out.println((i + 1) + ". DVD - " + disc.getTitle() + " - "
                    + disc.getCategory() + " - " + disc.getDirector()
                    + " - " + disc.getLength() + ": " + disc.getCost() + " $");
            totalCost += disc.getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    //Search hust.soict.dsai.aims.cart.Cart by ID
    public DigitalVideoDisc searchById(int itemID) {
        for (int i = 0; i < itemOrdered; i++) {
            if (items[i].getId() == itemID) {
                return items[i];
            }
        }
        System.out.println("Not found DVD with ID: " + itemID);
        return null; //Not found
    }
    
    //Search DVD by Title
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < itemOrdered; i++) {
            if (items[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Founded DVD with title: " + items[i].getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found DVD with title: " + title);
        }
    }

    // Delete DVD out of hust.soict.dsai.aims.cart.Cart
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
