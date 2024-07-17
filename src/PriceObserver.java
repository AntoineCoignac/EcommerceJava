public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            double discount = 20.0;
            order.setTotalPrice(order.getTotalPrice() - discount);
            System.out.println("PriceObserver: A discount of $" + discount + " has been applied. New total price: " + order.getTotalPrice());
        } else {
            System.out.println("PriceObserver: The total price is " + order.getTotalPrice());
        }
    }
}
