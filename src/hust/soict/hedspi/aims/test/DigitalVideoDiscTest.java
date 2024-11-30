package hust.soict.hedspi.aims.test;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class DigitalVideoDiscTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science-Fiction");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker");

        System.out.println("DVD 1 ID: " + dvd1.getId()); 
        System.out.println("DVD 2 ID: " + dvd2.getId()); 
        System.out.println("DVD 3 ID: " + dvd3.getId()); 

        System.out.println("Total DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDisc()); 
    }
}
