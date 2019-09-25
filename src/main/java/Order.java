public class Order {
    double lengthTrip;
    int boardingPrice = 60;
    int kmPrice = 20;
    int discountOnOrder = 1_000;
    double discountPercent = .5;
    int maxDiscount = 100;

    double tripPrice(){
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
