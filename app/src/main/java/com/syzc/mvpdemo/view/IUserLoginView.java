package com.syzc.mvpdemo.view;

import com.syzc.mvpdemo.bean.User;

/**
 * Created by bodata on 16/10/9.
 */
public interface IUserLoginView {

    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
