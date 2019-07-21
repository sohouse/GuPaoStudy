package com.zp.designpattern.factory.simpleFactory;

public class GirlFriendFactory {

    public IGirlFriend makeGirlFriend(String type) {
        if (null == type || "".equalsIgnoreCase(type))
            return null;

        if ("longHair".equalsIgnoreCase(type)){
            return new LongHairGirlFriend();
        } else if ("longLegs".equalsIgnoreCase(type)){
            return new LongLegsGirlFriend();
        } else {
            return null;
        }
    }
}
