package runner;

import entity.Catalog;
import entity.Order;
import org.hibernate.Session;

import java.util.List;

//3. Вывести клиентов, что заказали выбранный дом в каталоге

public class Task_3 {

    public static void Task_3(Session session) {

        List<Catalog> catalogs = session.createQuery("FROM Catalog").list();

        System.out.println("Дом " + catalogs.get(0) + " выбрал: ");

        if (catalogs.get(0).getOrders().size() == 0) {
            System.out.println("Никто не выбрал.");
        }
        else {
            for (Order order : catalogs.get(0).getOrders()) {
                System.out.println(order.getClient().getName());
            }
        }
    }
}
