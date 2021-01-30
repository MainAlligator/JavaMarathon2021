package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(courier);
        System.out.println("Первый склад.");
        System.out.println(" Количество собранных заказов: " + warehouse.getCountPickedOrders());
        System.out.println(" Количество доставленных заказов: " + warehouse.getCountDeliveredOrder());
        System.out.println(" Зарплата курьера: " + courier.getSalary());
        System.out.println(" Зарплата сборщика: " + picker.getSalary());
        System.out.println();

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        picker1.doWork();
        courier1.doWork();
        System.out.println("Второй склад.");
        System.out.println(" Количество собранных заказов: " + warehouse1.getCountPickedOrders());
        System.out.println(" Количество доставленных заказов: " + warehouse1.getCountDeliveredOrder());
        System.out.println(" Зарплата курьера: " + courier1.getSalary());
        System.out.println(" Зарплата сборщика: " + picker1.getSalary());


    }

    static void businessProcess(Worker worker) {

        for (int i = 0; i < 10000; i++) {
            worker.doWork();

        }
        worker.bonus();
    }

}

