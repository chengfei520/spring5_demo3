package com.atguigu.spring5;

public class Orders {
    private String name;
    private String address;

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void printProperty(){
        System.out.println("name:"+name+" "+"address:"+address);
    }
}
