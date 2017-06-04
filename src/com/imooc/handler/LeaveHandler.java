package com.imooc.handler;

/**
 * Created by Administrator on 2017/6/4.
 * 责任链模式
 * 模拟公司请假
 * 请假少于三天,处经理可批准
 * 请假少于七天,部门经理可批准
 * 请假少于180天,需公司经理批准
 * 请假大于180天,不批准
 */
public abstract class LeaveHandler {
    LeaveHandler nextHandler;

    public void setNextHandler(LeaveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void process(int days);
}
