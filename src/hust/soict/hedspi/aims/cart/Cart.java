package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < 20) {
            if (!itemsOrdered.contains(media)) {
                itemsOrdered.add(media);
                System.out.println("Completed Added Media: " + media.getTitle());
            } else {
                System.out.println("The media is already in the cart");
            }
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addMedia(ArrayList<Media> mediaList) {
        for (Media media : mediaList) {
            if (itemsOrdered.size() < 20) {
                if (!itemsOrdered.contains(media)) {
                    itemsOrdered.add(media);
                    System.out.println("Completed Added Media: " + media.getTitle());
                } else {
                    System.out.println("The media is already in the cart");
                }
            } else {
                System.out.println("The cart is almost full.");
                break;
            }
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Completed Removed Media: " + media.getTitle());
        } else {
            System.out.println("Could not find the Media");
        }
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            System.out.println((i + 1) + ". " + media.getClass().getSimpleName() + " - "
                    + media.getTitle() + " - " + media.getCategory() + " - " + media.getCost() + " $");
            totalCost += media.getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    public Media searchById(int itemID) {
        for (Media media : itemsOrdered) {
            if (media.getId() == itemID) {
                return media;
            }
        }
        System.out.println("Not found Media with ID: " + itemID);
        return null;
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Founded Media with title: " + media.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found Media with title: " + title);
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
}
