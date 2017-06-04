package com.imooc.handler;

/**
 * Created by Administrator on 2017/6/4.
 */
public class DepartmentManager extends LeaveHandler{
    @Override
    public void process(int days) {
        if(days<=7){
            System.out.println("部门经理批准...");
        }else{
            this.nextHandler.process(days);
        }
    }
}
