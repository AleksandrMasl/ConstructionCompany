package runner;

import entity.Order;
import org.hibernate.Session;

import java.util.List;

//2. Вывести всю сумму заказов компании

public class Task_2 {

    public static void Task_2(Session session) {

        List<Order> orders = session.createQuery("FROM Order").list();
        double sum = 0;

        for (Order order : orders) {
            sum += order.getCatalog().getPrice();
        }

        System.out.println("Сумма всех заказов: " + sum);
    }
}
