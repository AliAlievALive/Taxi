public class Order {
    int boardingPrice = 60;
    int kmPrice = 20;
    int discountOnOrder = 1_000;
    double discountPercent = .05;
    int maxDiscount = 100;

    double calculateTripPrice(double lengthTrip){
        double result = lengthTrip * kmPrice + boardingPrice;
        double discount = 0.;
        if (result > discountOnOrder){
            discount = result * discountPercent;
            if (discount > maxDiscount) {
                discount = maxDiscount;
            }
        }
        return result - discount;
    }
}
