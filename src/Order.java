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
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getCount() {
        return count;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public int getId() {
        return id;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        notifyObservers();
    }

    public void setCount(int count) {
        this.count = count;
        notifyObservers();
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void addItem(double price) {
        this.itemCost += price;
        this.itemCount++;
        this.totalPrice += price;
        this.count = itemCount;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", count=" + count +
                ", shippingCost=" + shippingCost +
                ", itemCount=" + itemCount +
                ", itemCost=" + itemCost +
                '}';
    }
}
