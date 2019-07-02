package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.CountOrderMapper;
import com.j1902.shopping.pojo.CountOrder;
import com.j1902.shopping.service.CountOrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class CountOrderImpl implements CountOrderService {
    @Autowired
    private CountOrderMapper countOrderMapper;
    @Override
    public int insert(CountOrder countOrder) {

        return 0;
    }
}
