package com.zp.designpattern.factory.factorymethod;

public class SiChuanGirlFriendFactory implements IGirlFriendFactory {
    public IGirlFriend makeGirlFriend(String type) {
        if ("longHair".equalsIgnoreCase(type)){
            return new SiChuanLongHairGirlFriend();
        } else if ("longLegs".equalsIgnoreCase(type)){
            return new SiChuanLongHairGirlFriend();
        } else {
            return null;
        }
    }
}
