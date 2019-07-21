package com.zp.designpattern.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        String type = "longLegs";

        IGirlFriendFactory factory = new SiChuanGirlFriendFactory();
        IGirlFriend girlFriend = factory.makeGirlFriend(type);
        girlFriend.sayHello();
    }
}
