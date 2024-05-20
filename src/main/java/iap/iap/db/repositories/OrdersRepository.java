package iap.iap.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iap.iap.model.Order;

public interface OrdersRepository extends JpaRepository<Order, Integer> {

}
