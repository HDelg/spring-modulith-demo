package com.hdr.spring_modulith_course.order;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInventoryRepository extends CrudRepository<OrderInventory, Long> {

    @Query(nativeQuery = true, value = "SELECT SUM(oi.order_inventory.total_qty_price) from order_inventory oi where oi.order_id = ?1")
    long orderIdAmount(long orderId);

}
