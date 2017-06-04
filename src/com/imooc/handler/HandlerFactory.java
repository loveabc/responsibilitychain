package com.imooc.handler;

/**
 * Created by Administrator on 2017/6/4.
 * 生成Handler,并设定责任关系
 */
public class HandlerFactory {
    private HandlerFactory(){

    }
    public static LeaveHandler getHandler(){
        LeaveHandler officeManager=new OfficeManager();
        LeaveHandler departmentManager=new DepartmentManager();
        LeaveHandler companyManager=new CompanyManager();
        officeManager.setNextHandler(departmentManager);
        departmentManager.setNextHandler(companyManager);
        return officeManager;
    }
}
