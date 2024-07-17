import java.util.ArrayList;
import java.util.List;
public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private double totalPrice;
    private int count;
    private double shippingCost = 10.0;
    private int id;
    private int itemCount;
    private double itemCost;

    public Order(int id) {
    }

    public void attach(OrderObserver observer) {
    }

    public void detach(OrderObserver observer) {
    }

    public double getTotalPrice() {
    }

    public int getCount() {
    }

    public double getShippingCost() {
    }

    public int getId() {
    }

    public void setTotalPrice(double totalPrice) {
    }

    public void setCount(int count) {
    }

    public void setShippingCost(double shippingCost) {
    }

    public void addItem(double price) {
    }

    private void notifyObservers() {
    }

    @Override
    public String toString() {
    }
}
