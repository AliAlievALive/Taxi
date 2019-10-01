package ru.itpark.service;

public class Order {
    private int boardingPrice = 60;
    private int kmPrice = 20;
    private int discountOnOrder = 1_000;
    private double discountPercent = .05;
    private int maxDiscount = 100;

    public int getBoardingPrice() {
        return boardingPrice;
    }

    public void setBoardingPrice(int boardingPrice) {
        this.boardingPrice = boardingPrice;
    }

    public int getKmPrice() {
        return kmPrice;
    }

    public void setKmPrice(int kmPrice) {
        this.kmPrice = kmPrice;
    }

    public int getDiscountOnOrder() {
        return discountOnOrder;
    }

    public void setDiscountOnOrder(int discountOnOrder) {
        this.discountOnOrder = discountOnOrder;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(int maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

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
