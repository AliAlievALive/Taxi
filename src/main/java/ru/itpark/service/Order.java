package ru.itpark.service;

public class Order {
    private int boardingPrice = 60;
    private int kmPrice = 20;
    private int discountOnOrder = 1_000;
    private double discountPercent = .05;
    private int maxDiscount = 100;

    double calculateTripPrice(double lengthTrip){
        double result = lengthTrip * kmPrice + boardingPrice;
        double discount = 0;
        if (result > discountOnOrder){
            discount = result * discountPercent;
            if (discount > maxDiscount) {
                discount = maxDiscount;
            }
        }
        return result - discount;
    }
}
