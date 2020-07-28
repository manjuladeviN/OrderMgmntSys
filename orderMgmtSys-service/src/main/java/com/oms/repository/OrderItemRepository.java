package com.oms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oms.model.OrderItem;
@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {

}
