public class StoreTest {
    public static void main(String[] args) {
        // Create new Store
        Store store = new Store();

        // Create DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci-Fi", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        
        // Add DVDs
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Print Store
        System.out.println("Store List");
        store.printStore();

        //Remove DVDs
        store.removeDVD(dvd3);

        // Print Store after remove dvd3
        System.out.println("Store List");
        store.printStore();

        // Remove unfound DVDs
        store.removeDVD(dvd3);
    }
}