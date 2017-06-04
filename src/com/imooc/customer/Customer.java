package com.imooc.customer;

import com.imooc.handler.LeaveHandler;

/**
 * Created by Administrator on 2017/6/4.
 */
public class Customer {
    public LeaveHandler handler;
    public Customer(LeaveHandler handler){
        this.handler=handler;
    }
    public void leave(int days){
        handler.process(days);
    }
}
