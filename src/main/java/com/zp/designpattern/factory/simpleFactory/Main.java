package com.zp.designpattern.factory.simpleFactory;

public class Main {
    public static void main(String[] args) {
        String type = "longHair";

        GirlFriendFactory factory = new GirlFriendFactory();
        IGirlFriend girlFriend = factory.makeGirlFriend(type);
        girlFriend.sayHello();
    }
}
