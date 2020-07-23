package com.javatechie.aws.lambda.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private int id;
    private String name;
    private double price;
    private int quantity;
}
