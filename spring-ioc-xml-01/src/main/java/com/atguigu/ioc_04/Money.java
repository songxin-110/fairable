package com.atguigu.ioc_04;

public class Money {
    /*
    * 利用spring容器生命周期方法需要注意：
    * 方法的权限修饰符必须为public 必须为无参数 无返回值 方法名可随意
    * */
    public void init(){
        System.out.println("init");
    }

    //销毁方法
    public void destroy(){
        System.out.println("destroy");
    }
}
