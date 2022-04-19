package com.micropos.carts.repository;

import com.micropos.carts.model.Cart;

public interface CartRepository {

    Cart getCart();

    boolean putProduct(String productId, int quantity);
    boolean deleteProduct(String productId, int quantity);
    int getProductQuantity(String productId);

}