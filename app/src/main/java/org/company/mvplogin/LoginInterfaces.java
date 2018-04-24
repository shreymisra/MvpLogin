package org.company.mvplogin;

/**
 * Created by shrey on 25/4/18.
 */

public interface LoginInterfaces {

    interface loginView {
        void initView();

        void loginValidation();

        void loginError();

        void loginSuccess();
    }

    interface loginPresenter{
        void onClick(String email,String password);
    }

    interface loginModel{
        String getData();
    }
}
