package lenovo.medical.com.daggerdemo.presenter;

import java.util.List;

import javax.inject.Inject;

import lenovo.medical.com.daggerdemo.models.User;

/**
 * Created by lenovo on 2016/4/8.
 */
public class WrapperWork {

    private IUserHandler userHandler;
    @Inject
    public WrapperWork(UserHandler userHandler){
        this.userHandler = userHandler;
    }

    public List<User> getWrapperUser(){
        return  userHandler.getUsers();
    }
}
