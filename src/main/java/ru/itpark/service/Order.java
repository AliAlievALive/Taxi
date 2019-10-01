package ru.itpark.service;

public class Order {
    private int boardingPrice;
    private int kmPrice;
    private int discountOnOrder;
    private double discountPercent;
    private int maxDiscount;

    public Order() {
        this.boardingPrice = 60;
        this.kmPrice = 20;
        this.discountOnOrder = 1_000;
        this.discountPercent = .05;
        this.maxDiscount = 100;
    }

    public int getBoardingPrice() {
        return boardingPrice;
    }

    public int getKmPrice() {
        return kmPrice;
    }

    public int getDiscountOnOrder() {
        return discountOnOrder;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public int getMaxDiscount() {
        return maxDiscount;
    }

    double calculateTripPrice(double lengthTrip){
        double result = lengthTrip * getKmPrice() + getBoardingPrice();
        double discount = 0;
        if (result > getDiscountOnOrder()){
            discount = result * getDiscountPercent();
            if (discount > getMaxDiscount()) {
                discount = getMaxDiscount();
            }
        }
        return result - discount;
    }
}
