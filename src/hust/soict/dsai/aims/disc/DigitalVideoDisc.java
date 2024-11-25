package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // classifier member
    private static int nbDigitalVideoDisc = 0;

    // instance
    private int id;

    // constructor
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDisc++; 
        this.id = nbDigitalVideoDisc; 
    }

    public DigitalVideoDisc(String title, String category) {
        this(title); 
        this.category = category;
    }

    public DigitalVideoDisc(String title, String category, String director) {
        this(title, category); 
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length) {
        this(title, category, director); 
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, length);
        this.cost = cost;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}