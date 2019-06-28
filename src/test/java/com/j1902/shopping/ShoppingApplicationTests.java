package com.j1902.shopping;

import com.j1902.shopping.mapper.CountOrderMapper;
import com.j1902.shopping.mapper.OrderMapper;
import com.j1902.shopping.model.OrdersQv;
import com.j1902.shopping.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingApplicationTests {
@Autowired
private CountOrderMapper countOrderMapper;
@Autowired
private OrderMapper orderMapper;
    @Test
    public void contextLoads() {
        System.out.println("aaaaaaaaaaa");
      /*  List<Order> orders = orderMapper.selectByOrder_count_id(1000);
        for (Order order : orders) {
            System.out.println("order = " + order);
        }*/
        List<OrdersQv> aa = countOrderMapper.selectBySta("未处理");
        System.out.println(aa.get(0)+"----"+"aaa"+aa.get(0).getOrderList().size());
        List<OrdersQv> a2 = countOrderMapper.selectBySta("已处理");
        System.out.println("wuskdk :"+a2.get(0).getOrderList().size());

    }

}
