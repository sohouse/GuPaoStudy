package com.zp.designpattern.factory.simpleFactory;

public abstract class IGirlFriend {
    {
        makeCoquetry();
    }

    private void makeCoquetry(){
        System.out.println("嘤嘤嘤~");
    }

    abstract void sayHello();
}
