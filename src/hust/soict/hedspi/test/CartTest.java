// package hust.soict.hedspi.aims.test;

// import hust.soict.hedspi.aims.cart.Cart;
// import hust.soict.hedspi.aims.media.DigitalVideoDisc;

// public class CartTest {
//     public static void main(String[] args) {
//         Cart cart = new Cart();

//         DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//         DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci-Fi", "George Lucas", 124, 24.95f);
//         DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

//         cart.addMedia(dvd1);
//         cart.addMedia(dvd2);
//         cart.addMedia(dvd3);

//         // Print list of hust.soict.dsai.aims.cart.Cart
//         cart.printCart();

//         // Search with ID
//         DigitalVideoDisc foundById = media.searchById(2); // Starwar ID
//         if (foundById != null) {
//             System.out.println("Founded DVD with ID: " + foundById.getTitle());
//         }

//         // Search with Title
//         cart.searchByTitle("Star");
//     }
// }