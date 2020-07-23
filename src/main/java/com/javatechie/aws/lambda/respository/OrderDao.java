package com.javatechie.aws.lambda.respository;

import com.javatechie.aws.lambda.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> buildOrders(){
        return Stream.of(
                new Order(101, "Mobile", 20000, 1),
                new Order(102, "Book", 999, 2),
                new Order(278, "Book", 1466, 3),
                new Order(953, "Jeans", 4499, 1)
        ).collect(Collectors.toList());
    }
}
