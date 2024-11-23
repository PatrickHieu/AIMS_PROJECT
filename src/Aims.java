public class Aims {
    public static void main(String[] args) {
        // Create Cart
        Cart cart = new Cart();

        //Create DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 87, 18.99f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Total Cost
        System.out.println("Total Cost is: $" + cart.totalCost());

        // Delete and show Total Cost
        cart.removeDigitalVideoDisc(dvd2);
        System.out.println("Final Total Cost is: $" + cart.totalCost());
    }
}
