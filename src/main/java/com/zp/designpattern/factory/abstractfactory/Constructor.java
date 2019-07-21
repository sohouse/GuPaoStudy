package com.zp.designpattern.factory.abstractfactory;

public class Constructor {
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
