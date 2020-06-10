package com.atguigu.spring5.bean;

public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步调用无参构造器");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步调用set方法设置属性值");
    }
    public void initOrders(){
        System.out.println("第四步初始化方法被调用了");
    }
    public void destroyOrders(){
        System.out.println("第七步销毁对象方法被调用了");
    }
}
