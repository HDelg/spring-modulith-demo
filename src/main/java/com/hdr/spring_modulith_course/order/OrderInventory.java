package com.hdr.spring_modulith_course.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(indexes = {
    @Index(name = "ord_idx", columnList = "order_id"),
    @Index(name = "inv_idx", columnList = "inventory_id")
})
public class OrderInventory {

    private Long id;
    private long orderId;
    private long inventoryId;
    private int qty;
    private long totalQtyPrice;
}
