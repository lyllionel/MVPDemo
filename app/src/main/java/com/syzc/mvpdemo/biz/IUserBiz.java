package com.syzc.mvpdemo.biz;

/**
 * Created by bodata on 16/10/9.
 */
public interface IUserBiz {

    public void login(String username, String password, OnLoginListener loginListener);

}
