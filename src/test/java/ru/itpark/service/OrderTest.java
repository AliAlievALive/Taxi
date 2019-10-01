package ru.itpark.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    @DisplayName("Should calculate trip price without discount")
    void calculateTripPriceWithoutDiscount() {
        var trip = new Order();
        var result = trip.calculateTripPrice(10);

        assertEquals(260, result);
    }

    @Test
    @DisplayName("Should calculate trip price with discount")
    void calculateTripPriceWithDiscount() {
        var trip = new Order();
        var result = trip.calculateTripPrice(50);

        assertEquals(1007, result);
    }

    @Test
    @DisplayName("Should calculate trip price with max discount")
    void calculateTripPriceWithMaxDiscount() {
        var trip = new Order();
        var result = trip.calculateTripPrice(100);

        assertEquals(1960, result);
    }
}