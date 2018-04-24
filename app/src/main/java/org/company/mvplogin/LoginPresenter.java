package org.company.mvplogin;

import android.text.TextUtils;

/**
 * Created by shrey on 25/4/18.
 */

public class LoginPresenter implements LoginInterfaces.loginPresenter {

    LoginInterfaces.loginView view;
    LoginInterfaces.loginModel model;
    LoginPresenter(LoginInterfaces.loginView view){
        this.view=view;
        initModel();
    }

    public void initModel(){
        model=new LoginModel();
        view.initView();
    }
    @Override
    public void onClick(String email,String password){
        String data=model.getData();
        if(TextUtils.isEmpty(email)||TextUtils.isEmpty(password))
            view.loginValidation();
        else if(email.equals("shrey")&&password.equals("shrey"))
            view.loginSuccess();
        else
            view.loginError();
    }
}
