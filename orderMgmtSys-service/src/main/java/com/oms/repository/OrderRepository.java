package com.oms.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oms.model.Order;
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {


}
