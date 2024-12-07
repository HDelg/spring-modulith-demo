package com.hdr.spring_modulith_course.order;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OrderRepository extends CrudRepository<Order, Long>{

    Optional<Order> getOrderByOrderIdentifier(String orderIdentifier);

}
