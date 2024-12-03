package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import hust.soict.hedspi.aims.store.Store;
import java.util.Scanner;

public class Aims {
    private static Store store;
    private static Cart cart;

    public static void main(String[] args) {
        store = new Store();
        cart = new Cart();
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        scanner.close();

        while (true) {
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    storeMenu();
                    break;
                // case 2:
                //     updateStore();
                //     break;
                case 3:
                    cartMenu();
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void storeMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        scanner.close();

        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3-4: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    cart.printCart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void seeMediaDetails() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("Enter the media title: ");
        String title = scanner.nextLine();

        Media media = store.searchByTitle(title);
        if (media != null) {
            System.out.println("Media Details: ");
            System.out.println(media.toString());
            mediaDetailsMenu();
        } else {
            System.out.println("Not found media");
        }
    }

    public static void mediaDetailsMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        scanner.close();

        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMediaToCart();
                    break;
                case 2:
                    playMedia();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addMediaToCart() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("Enter the media title: ");
        String title = scanner.nextLine();

        Media media = store.searchByTitle(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Completed Add media " + media.getTitle());
        } else {
            System.out.println("Not found media");
        }
    }

    public static void playMedia() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("Enter the media title: ");
        String title = scanner.nextLine();

        Media media = store.searchByTitle(title);
        if (media != null) {
            if (media instanceof Playable) {
                ((Playable) media).play();
            } else {
                System.out.println("This media can't be play");
            }
        } else {
            System.out.println("Not found media");
        }
    }

    public static void cartMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        scanner.close();

        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3-4-5: ");
            choice = scanner.nextInt();

            switch (choice) {
                // case 1:
                //     filterMediasInCart();
                //     break;
                // case 2:
                //     sortMediasInCart();
                //     break;
                // case 3:
                //     removeMediaFromCart();
                //     break;
                case 4:
                    playMedia();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void placeOrder() {
        System.out.println("Order Successfully!");
    }
}