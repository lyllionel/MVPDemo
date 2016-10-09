package com.syzc.mvpdemo.biz;

import com.syzc.mvpdemo.bean.User;

/**
 * Created by bodata on 16/10/9.
 */
public interface OnLoginListener {

    void loginSuccess(User user);
    void loginFailed();

}
