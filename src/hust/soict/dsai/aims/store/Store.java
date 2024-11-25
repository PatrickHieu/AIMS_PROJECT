package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    // Add DVDs
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("Added DVD to store: " + dvd.getTitle());
    }

    // Remove DVDs
    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("Removed DVD from store: " + dvd.getTitle());
        } else {
            System.out.println("Not Found DVD " + dvd.getTitle() + " in store");
        }
    }

    // Print hust.soict.dsai.aims.store.Store
    public void printStore() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            DigitalVideoDisc dvd = itemsInStore.get(i);
            System.out.println((i + 1) + ". DVD - " + dvd.getTitle() + " - "
                    + dvd.getCategory() + " - " + dvd.getDirector()
                    + " - " + dvd.getLength() + ": " + dvd.getCost() + " $");
        }
        System.out.println("***************************************************");
    }
}
