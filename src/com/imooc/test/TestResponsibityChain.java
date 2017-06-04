package com.imooc.test;

import com.imooc.customer.Customer;
import com.imooc.handler.HandlerFactory;
import com.imooc.handler.LeaveHandler;

/**
 * Created by Administrator on 2017/6/4.
 */
public class TestResponsibityChain {
    public static void main(String[] args){
        LeaveHandler handler= HandlerFactory.getHandler();
        Customer customer=new Customer(handler);
        customer.leave(1000);
    }
}
