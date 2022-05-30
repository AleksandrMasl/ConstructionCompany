package runner;

import entity.Catalog;
import org.hibernate.Session;

import java.util.List;

// 1. Вывести все этажность домов

public class Task_1 {

    public static void Task_1(Session session) {

        List<Catalog> catalogs = session.createQuery("FROM Catalog").list();

        for (Catalog catalog : catalogs) {
            System.out.println("Этажность дома " + catalog.getName() + ":\n" +
                    + catalog.getSpecification().getFloorsNumber());
        }
    }
}
