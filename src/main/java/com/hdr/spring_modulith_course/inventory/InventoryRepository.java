package com.hdr.spring_modulith_course.inventory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface InventoryRepository extends CrudRepository<Inventory, Long>{

    Optional<Inventory> getInventoryByName(String name);

    List<Inventory> getInventoryByNameIn(List<String> names);

}
