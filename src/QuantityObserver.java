public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getCount() > 5) {
            order.setShippingCost(0.0);
            System.out.println("QuantityObserver: Shipping cost set to $0.00 due to quantity > 5");
        } else {
            order.setShippingCost(10.0);
            System.out.println("QuantityObserver: Shipping cost is $" + order.getShippingCost() + " due to quantity <= 5");
        }
    }
}
