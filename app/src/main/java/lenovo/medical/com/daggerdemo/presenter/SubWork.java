package lenovo.medical.com.daggerdemo.presenter;

import java.util.List;

import javax.inject.Inject;

import lenovo.medical.com.daggerdemo.models.Weather;

/**
 * Created by lenovo on 2016/4/8.
 */
public class SubWork {

//    private IUserHandler userHandler;
    private DiskWork diskWork;
//    @Inject
//    public SubWork(UserHandler userHandler){
//        this.userHandler = userHandler;
//    }

    @Inject
    public SubWork(DiskWork diskWork){
        this.diskWork = diskWork;
    }

//    public List<User> getWrapperUser(){
//        return  userHandler.getUsers();
//   }

    public List<Weather> getWrapperWeather(){
        return diskWork.getWeathers();
    }
}
