package com.j1902.shopping.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.j1902.shopping.mapper.CartMapper;
import com.j1902.shopping.pojo.*;
import com.j1902.shopping.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    //添加购物车
    @Override
    public void addCart(Cart cart) {
        cartMapper.insert(cart);

    }
    //查询购物车
    @Override
    public List<Cart> getById(Integer id) {
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.or();
        criteria.andUserIdEqualTo(id);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        return carts!=null?carts:null;
    }

    //分页该用户购物车数据
    @Override
    public PageInfo<Cart> getByCount(Integer currentPage, Integer number, Integer userId) {
        PageHelper.startPage(currentPage,number);
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.or();
        criteria.andUserIdEqualTo(userId);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        PageInfo<Cart> cartPageInfo = new PageInfo<>(carts);
        return cartPageInfo!=null?cartPageInfo:null;

    }
    //清空购物车
    @Override
    public void deleteCart(Integer userId) {
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.or();
        criteria.andUserIdEqualTo(userId);
        cartMapper.deleteByExample(cartExample);
    }

    //删除单个购物车
    @Override
    public void deleteByCarId(Integer id) {
        cartMapper.deleteByPrimaryKey(id);
    }

    //查询该用户的购物车是否存在相同物品
    @Override
    public List<Cart> getByItemId(Integer id,Integer userId) {
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.or();
        criteria.andItemIdEqualTo(id).andUserIdEqualTo(userId);
        List<Cart> carts = cartMapper.selectByExample(cartExample);
        return carts;
    }
  //修改购物车已拥有相同物品数量和商品总价格
    @Override
    public void uplateById(Cart cart,Integer id, Integer userId) {
        CartExample cartExample = new CartExample();
        CartExample.Criteria criteria = cartExample.or();
        criteria.andItemIdEqualTo(id).andUserIdEqualTo(userId);
        cartMapper.updateByExampleSelective(cart,cartExample);
    }


}
