package com.j1902.shopping.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.j1902.shopping.mapper.CartMapper;
import com.j1902.shopping.pojo.Cart;
import com.j1902.shopping.pojo.CartExample;
import com.j1902.shopping.pojo.CountOrderExample;
import com.j1902.shopping.pojo.User;
import com.j1902.shopping.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Override
    public void addCart(Cart cart) {
        cartMapper.insert(cart);

    }

    @Override
    public List<Cart> getById(Integer id) {
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.or();
        criteria.andUserIdEqualTo(id);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        return carts;
    }

    @Override
    public PageInfo<Cart> getByCount(Integer currentPage, Integer number, Integer userId) {
//        long count= cartMapper.countByExample(null);
        PageHelper.startPage(currentPage,number);
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.or();
        criteria.andUserIdEqualTo(userId);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        PageInfo<Cart> cartPageInfo = new PageInfo<>(carts);
        return cartPageInfo;

    }

    @Override
    public void deleteCart() {
        cartMapper.deleteByExample(null);
    }


}
