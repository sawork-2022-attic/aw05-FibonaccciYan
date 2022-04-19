package com.micropos.carts.service;

import com.micropos.carts.model.Cart;

import java.util.List;

public interface CartsService {

    Cart getCart();

    boolean putProduct(String productId, int quantity);
    boolean deleteProduct(String productId, int quantity);
    int getProductQuantity(String productId);

}