package Exerise;

// ผู้ผลิต

import java.util.ArrayList;

class Producer {
    String studioName;
    String country;

    public Producer(String studioName, String country) {
        this.studioName = studioName;
        this.country = country;
    }

    public void displayProducer() {
        System.out.println("Studio Name: " + this.studioName + " Contry: " + country);
    }
}

interface Downloadable {
    public void download();
}

abstract class Media {
    double result;
    String title;
    double basePrice;
    Producer producer; // Composition: เป็นการสร้าง "ความสัมพันธ์" ว่าวัตถุหนึ่ง "มี"
                       // อีกวัตถุหนึ่งประกอบอยู่ข้างใน

    public Media(String title, double basePrice, Producer producer) {
        this.title = title;
        this.basePrice = basePrice;
        this.producer = producer;

    }

    abstract double calculateRentalPrice(int days);

    void showInfo() {
        System.out.println("Title: " + this.title + " Producer: " + this.producer.studioName );
    }

}

class Movie extends Media {

    public Movie(String title, double basePrice, Producer producer) {
        super(title, basePrice, producer);
    }

    @Override
    double calculateRentalPrice(int days) {
        return result = (basePrice * days) + 20;
    }
}

class Music extends Media implements Downloadable {
    public Music(String title, double basePrice, Producer producer) {
        super(title, basePrice, producer);
    }

    @Override
    double calculateRentalPrice(int days) {
        return result = (basePrice * days);
    }

    @Override
    public void download() {
        System.out.println("Dowloading music:" + title);
    };
}

public class MediaRentalSystem {
    public static void main(String[] args) {
        // Composition
        Producer marvel = new Producer("Marvel", "USA");
        Producer dc = new Producer("Dc", "USA");
        Producer gmm = new Producer("GMM", "THAI");

        ArrayList<Media> inventory = new ArrayList<>();
        inventory.add(new Movie("Spider-man", 200, marvel));
        inventory.add(new Movie("Super-man", 200, dc));
        inventory.add(new Music("NangFar", 100, gmm));
        inventory.add(new Music("Labanun", 100, gmm));

        for (Media item : inventory) {
            System.out.println("Price: " + item.calculateRentalPrice(7));
            item.showInfo();
        }

        for (Media item : inventory) {
            item.showInfo();
            if (item instanceof Downloadable downloadable) {
                downloadable.download();
            }
        }
    }
}
