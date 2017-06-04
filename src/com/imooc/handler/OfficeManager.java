package com.imooc.handler;

/**
 * Created by Administrator on 2017/6/4.
 */
public class OfficeManager extends LeaveHandler{
    @Override
    public void process(int days) {
        if(days<=3){
            System.out.println("处经理批准...");
        }else{
            this.nextHandler.process(days);
        }
    }
}
