package com.zp.designpattern.factory.abstractfactory;

public class HeBeiGirlFriend implements IGirlFriendFactory {

    public IEye choseEyes() {
        return new BlueEyes();

    }

    public IHair choseHair() {
        return new LongHair();
    }
}
