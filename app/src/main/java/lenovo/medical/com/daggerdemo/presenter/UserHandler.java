package lenovo.medical.com.daggerdemo.presenter;

import java.util.List;

import javax.inject.Inject;

import lenovo.medical.com.daggerdemo.models.User;

/**
 * Created by lenovo on 2016/4/8.
 */
public class UserHandler implements IUserHandler{
    NetWork netWork;

    @Inject
    public UserHandler(NetWork netWork){
        this.netWork = netWork;
    }

    @Override
    public List<User> getUsers() {

        return netWork.getUsers();
    }
}
