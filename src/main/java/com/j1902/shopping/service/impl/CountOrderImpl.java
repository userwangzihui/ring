package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.CountOrderMapper;
import com.j1902.shopping.pojo.CountOrder;
import com.j1902.shopping.pojo.CountOrderExample;
import com.j1902.shopping.service.CountOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountOrderImpl implements CountOrderService {
    @Autowired
    private CountOrderMapper countOrderMapper;
    @Override
    public int insert(CountOrder countOrder) {
        return  countOrderMapper.insertByKey(countOrder);
    }
}
