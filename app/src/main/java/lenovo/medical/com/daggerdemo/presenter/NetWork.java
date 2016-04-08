package lenovo.medical.com.daggerdemo.presenter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import lenovo.medical.com.daggerdemo.models.User;
import lenovo.medical.com.daggerdemo.models.Weather;

/**
 * Created by lenovo on 2016/4/8.
 */
public class NetWork {

    @Inject
    public NetWork(){

    }

    public List<User> getUsers(){
        List<User> users = new ArrayList<>();

        for (int i = 0;i < 5 ;i++){
            User user = new User();
            user.setName("name"+i);
            users.add(user);
        }
        return users;
    }


}
