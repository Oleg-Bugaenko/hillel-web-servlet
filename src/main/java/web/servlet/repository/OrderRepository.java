package web.servlet.repository;

import org.springframework.stereotype.Service;
import web.servlet.model.Order;
import web.servlet.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderRepository {
    private List<Order> orders = new ArrayList<>();

    public Order getOrderById(Integer id) {
        return orders.stream().filter(ord -> ord.getId() == id).findFirst().get();
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    private OrderRepository() {
        List<Product> products1 = new ArrayList<>() {{
            add(new Product(1, "Bred", 22.));
            add(new Product(2, "Milk", 25.6));
            add(new Product(3, "Cookie", 30.));
        }};
        Order order1 = new Order(1);
        order1.setProducts(products1);
        orders.add(order1);

        List<Product> products2 = new ArrayList<>() {{
            add(new Product(1, "Coffee", 89.));
            add(new Product(2, "Milk", 25.6));

        }};
        Order order2 = new Order(2);
        order2.setProducts(products2);
        orders.add(order2);
    }

}
