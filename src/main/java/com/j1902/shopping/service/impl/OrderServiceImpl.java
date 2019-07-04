package com.j1902.shopping.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.j1902.shopping.mapper.CountOrderMapper;
import com.j1902.shopping.mapper.OrderMapper;
import com.j1902.shopping.model.OrdersQv;
import com.j1902.shopping.pojo.CountOrder;
import com.j1902.shopping.pojo.CountOrderExample;
import com.j1902.shopping.pojo.Order;
import com.j1902.shopping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private CountOrderMapper countOrderMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<CountOrder> selectCountOrdersBySta(String sta) {
        CountOrderExample countOrderExample = new CountOrderExample();
        CountOrderExample.Criteria or = countOrderExample.or();
        or.andCountSatEqualTo(sta);
        List<CountOrder> countOrders = countOrderMapper.selectByExample(countOrderExample);
        if (countOrders != null && countOrders.size() > 0) {
            return countOrders;
        }
        return null;
    }

    @Override
    public PageInfo<OrdersQv> seletCountOrderByPage(Integer current, Integer number, String order, String sta) {
        PageHelper.startPage(current, number, order);
        List<OrdersQv> list = countOrderMapper.selectBySta(sta);
        PageInfo<OrdersQv> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public void updateCountOrderStaById(Integer id) {
        CountOrder countOrder = new CountOrder();
        countOrder.setCountId(id);
        countOrder.setCountSat("已处理");
        countOrderMapper.updateByPrimaryKeySelective(countOrder);
    }

    @Override
    public void updateCountOrderStaBySat() {
        CountOrder countOrder = new CountOrder();
        countOrder.setCountSat("未处理");
        CountOrderExample countOrderExample = new CountOrderExample();
        CountOrderExample.Criteria or = countOrderExample.or();
        or.andCountSatEqualTo("待处理");
        countOrderMapper.updateByExampleSelective(countOrder, countOrderExample);
    }

    @Override
    public int selectWaitCountOrder() {
        List<OrdersQv> orders = countOrderMapper.selectBySta("待处理");
        for (OrdersQv order : orders) {
            System.out.println(order.getCountId());
        }
        return orders != null ? orders.size() : 0;
    }

    @Override
    public int insertOrder(List<Order> orders) {
        int insert = 0;
        for (Order order : orders) {
            insert += orderMapper.insertByOrder(order);
        }
        return insert;
    }
}
