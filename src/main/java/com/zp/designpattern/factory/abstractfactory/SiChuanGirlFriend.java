package com.zp.designpattern.factory.abstractfactory;

public class SiChuanGirlFriend implements IGirlFriendFactory {

    public IEye choseEyes() {
        return new BlackEyes();
    }

    public IHair choseHair() {
        return new ShortHair();
    }
}
