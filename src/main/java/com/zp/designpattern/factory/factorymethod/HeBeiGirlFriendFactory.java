package com.zp.designpattern.factory.factorymethod;


public class HeBeiGirlFriendFactory implements IGirlFriendFactory {
    public IGirlFriend makeGirlFriend(String type) {
        if ("longHair".equalsIgnoreCase(type)){
            return new HeBeiLongHairGirlFriend();
        } else if ("longLegs".equalsIgnoreCase(type)){
            return new HeBeiLongHairGirlFriend();
        } else {
            return null;
        }
    }
}
