package day11.task1;

public class Warehouse {
    private int countPickedOrders; // к-во собранных заказов

    private int countDeliveredOrder; // к-во доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrder() {
        return countDeliveredOrder;
    }

    public void addDelivery() {
        ++countDeliveredOrder;

    }

    public void addPicked() {
        ++countPickedOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrder=" + countDeliveredOrder +
                '}';
    }
}
