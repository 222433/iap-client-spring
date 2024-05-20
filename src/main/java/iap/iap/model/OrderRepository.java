package iap.iap.model;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class OrderRepository {

    public Collection<Order> getOrders() {
        Order o = new Order(1, 2, 2);
        List<Order> res = new LinkedList<>();
        res.add(o);
        return res;
    }

}
