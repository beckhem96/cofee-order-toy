package com.prc.coffeeorder.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class CreateOrder {
    private int customerId;
    private int storeId;
    private Map<Integer, Integer> quantityByProduct;
}
