package ru.itpark.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    @DisplayName("Should calculate trip without discount")
    void calculateTripPrice() {
        var order = new Order();
        var result = order.calculateTripPrice(10);
        assertEquals(260, result);
    }

    @Test
    @DisplayName("Should calculate trip with max discount")
    void calculateTripPriceWithMaxDiscount() {
        var order = new Order();
        var result = order.calculateTripPrice(1000);
        assertEquals(19960, result);
    }

    @Test
    @DisplayName("Should calculate trip with 5% discount")
    void calculateTripPriceFivePercentDiscount() {
        var order = new Order();
        var result = order.calculateTripPrice(100);
        assertEquals(1960, result);
    }
}