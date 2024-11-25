package hust.soict.dsai.aims.test;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

// Correctly swap method
public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        DigitalVideoDisc[] dvd = { jungleDVD, cinderellaDVD };

        System.out.println("Jungle DVD Title: " + dvd[0].getTitle());
        System.out.println("Cinderella DVD Title: " + dvd[1].getTitle());

        swap(dvd);
        System.out.println("Swap Title");
        System.out.println("Jungle DVD Title: " + dvd[0].getTitle());
        System.out.println("Cinderella DVD Title: " + dvd[1].getTitle());
    }

    public static void swap(DigitalVideoDisc[] dvd) {
        DigitalVideoDisc temp = dvd[0];
        dvd[0] = dvd[1];
        dvd[1] = temp;
    }
}

    