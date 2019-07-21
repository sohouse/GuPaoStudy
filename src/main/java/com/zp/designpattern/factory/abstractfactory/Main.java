package com.zp.designpattern.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        IGirlFriendFactory gf = new Main().returnGF("sichuan");
        gf.choseEyes().say();
        gf.choseHair().say();
    }

    public IGirlFriendFactory returnGF(String type)  {
        if ("hebei".equalsIgnoreCase(type)) {
            return new HeBeiGirlFriend();
        } else if ("sichuan".equalsIgnoreCase(type)){
            return new SiChuanGirlFriend();
        } else {
            return null;
        }
    }
}
