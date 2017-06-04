package com.imooc.handler;

/**
 * Created by Administrator on 2017/6/4.
 */
public class CompanyManager extends LeaveHandler{
    @Override
    public void process(int days) {
        if(days<=180){
            System.out.println("公司经理批准...");
        }else{
            System.out.println("请假时间过长,不批准");
        }
    }
}
