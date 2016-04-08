package lenovo.medical.com.daggerdemo.modules;

import dagger.Module;
import dagger.Provides;
import lenovo.medical.com.daggerdemo.presenter.IUserHandler;
import lenovo.medical.com.daggerdemo.presenter.UserHandler;
import lenovo.medical.com.daggerdemo.presenter.WrapperWork;

/**
 * Created by lenovo on 2016/4/8.
 */
@Module
public class WorkModule {

    @Provides
    WrapperWork getWrapperWork(UserHandler userHandler){
        return new WrapperWork(userHandler);
    }
}
