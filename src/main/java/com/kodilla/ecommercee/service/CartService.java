package com.kodilla.ecommercee.service;

import com.kodilla.ecommercee.dao.CartDao;
import com.kodilla.ecommercee.dao.ProductDao;
import com.kodilla.ecommercee.domain.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CartService {
    @Autowired
    private CartDao cartDao;

    @Autowired
    private ProductDao productDao;

    public List<Cart> getAllCarts(){
        return cartDao.findAll();
    }

    public Optional<Cart> getCartById(final Long id){
        return cartDao.findById(id);
    }

    public Cart saveCart(final Cart cart){
        return cartDao.save(cart);
    }

    public void deleteCartById(final Long id){
        cartDao.deleteById(id);
    }

    public Cart getCart(Long cartId) {
        return cartDao.findById(cartId).orElse(new Cart());
    }


}