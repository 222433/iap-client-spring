package iap.iap;

import java.util.Collection;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iap.iap.db.repositories.OrdersRepository;
import iap.iap.model.Order;
import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("orders")
@AllArgsConstructor
public class OrdersController {

    public OrdersRepository ordersRepository;
    public JdbcTemplate jdbcTemplate;

    @PostMapping
    public boolean order(@RequestBody List<Order> orders) {
        List<Order> os = jdbcTemplate.query("select * from public.\"Orders\"", row -> null);
        return true;
    }
}
