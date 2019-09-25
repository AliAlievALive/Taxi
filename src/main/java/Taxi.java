public class Taxi {
    public static void main(String[] args) {
        Order toHome = new Order();
        toHome.lengthTrip = 100;
        System.out.println(toHome.tripPrice());
    }
}
