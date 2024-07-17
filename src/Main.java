public class Main {
    public static void main(String[] args) {
        Order order = new Order(1234);
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();

        order.attach((OrderObserver) priceObserver);
        order.attach((OrderObserver) quantityObserver);

        order.addItem(50.0);
        order.addItem(60.0);
        order.addItem(100.0);
        order.addItem(30.0);

        System.out.println(order);

        order.addItem(10.0);
        order.addItem(20.0);

        System.out.println(order);
    }
}
