package ru.itpark;

public class Taxi {
    public static void main(String[] args) {
        Order toHome = new Order();
        double lengthTrip = 100;
        System.out.println(toHome.calculateTripPrice(lengthTrip));
    }
}
